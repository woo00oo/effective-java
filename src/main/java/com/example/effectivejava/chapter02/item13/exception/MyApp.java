package com.example.effectivejava.chapter02.item13.exception;

public class MyApp {

    public void hello() {
        System.out.println("hello");
        throw new MyException();
    }

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.hello();
    }

}

/**
 * checkedException vs UnCheckedException
 *
 * 왜 우리는 UnCheckedException를 선호 하는가?
 *
 * 컴파일 에러를 신경쓰지 않아도 되며, try-catch로 감싸거나 메서드 선언부에 선언하지 않아도 된다.
 * 그렇다면 우리는 언체크 예외만 쓰면 되는걸까? 체크 예외는 왜 있는 것일까?
 *
 * 왜 잡지 않은 예외를 메서드에 선언해야 하는가?
 * 메서드에 선언한 예외는 프로그래밍 인터페이스의 일부다. 즉, 해당 메서드를 사용하는 코드가 반드시 알아야 하는 정보다. 그래야 해당 예외가 발생했을 상황에서 대처하는 코드를 작성 할 수 있다.
 *
 * 언체크 예외는 그럼 왜 메서드에 선언하지 않아도 되는가?
 * 언체크 예외는 어떤 식으로든 처리하거나 복구할 수 없는 경우에 사용하는 예외다. 가령, 숫자를 0으로 나누거나, null 레퍼런스에 메서드를 호출하는 등.
 * 이런 예외는 프로그램 전반에 걸쳐 어디서든 발생할 수 있기 때문에 이 모든 언체크 예외를 메서드에 선언하도록 강제한다면 프로그램의 명확도가 떨어진다.
 *
 * 그럼 어떤 예외를 언제 써야 하는가?
 * 단순히 처리하기 쉽고 편하다는 이유만으로 RunTimeException을 선택하지는 말자
 *
 * > 클라이언트가 해당 예외 상황을 복구할 수 있다면 체크 예외를 사용하고, 해당 예외가 발생했을 때 아무것도 할 수 없다면, 언체크 예외로 만든다.
 *
 */