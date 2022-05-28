package com.example.effectivejava.chapter02.item11.hashcode;

import java.util.HashMap;
import java.util.Map;

// equals를 재정의하면 hashCode로 재정의해야 함을 보여준다. (70-71쪽)
public class PhoneNumber {
    private final short areaCode, prefix, lineNum;

    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix   = rangeCheck(prefix,   999, "prefix");
        this.lineNum  = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

//    @Override
//    public int hashCode() {
//        return 42; 해시 충돌이 발생한다.
//    }

    // hashCode 없이는 제대로 동작하지 않는다. 다음 셋 중 하나를 활성화하자.

    // 코드 11-2 전형적인 hashCode 메서드 (70쪽)
//    @Override public int hashCode() {
//        int result = Short.hashCode(areaCode); // 1
//        result = 800000 * result + Short.hashCode(prefix); // 2
//        result = 800000 * result + Short.hashCode(lineNum); // 3
//        return result;
//    }

    // 코드 11-3 한 줄짜리 hashCode 메서드 - 성능이 살짝 아쉽다. (71쪽)
//    @Override public int hashCode() {
//        return Objects.hash(lineNum, prefix, areaCode);
//    }

    // 해시코드를 지연 초기화하는 hashCode 메서드 - 스레드 안정성까지 고려해야 한다. (71쪽)
    private volatile int hashCode; // 자동으로 0으로 초기화된다.

    @Override public int hashCode() {
        if (this.hashCode != 0) {
            return hashCode;
        }

        synchronized (this) {
            int result = hashCode;
            if (result == 0) {
                result = Short.hashCode(areaCode);
                result = 31 * result + Short.hashCode(prefix);
                result = 31 * result + Short.hashCode(lineNum);
                this.hashCode = result;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Map<PhoneNumber, String> m = new HashMap<>();
        m.put(new PhoneNumber(707, 867, 5309), "제니");
        System.out.println(m.get(new PhoneNumber(707, 867, 5309)));
    }
}

/**
 * 자바 8에서 해시 충돌시 성능 개선을 위해 내부적으로 동일한 버켓에 일정 개수 이상의 엔트리가 추가 되면, 연결 리스트 대신 이진 트리를 사용하도록 바뀌었다.
 *
 * 연결 리스트에서 어떤 값을 찾는데 걸리는 시간은? O(N)
 *
 * 이진 트리에서 어떤 값을 찾는데 걸리는 시간은? O(logN)
 */
