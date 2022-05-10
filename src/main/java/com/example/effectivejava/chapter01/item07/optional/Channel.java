package com.example.effectivejava.chapter01.item07.optional;

import java.util.Optional;

public class Channel {

    private int numOfSubscribers;

    public Optional<MemberShip> defaultMemberShip() {
        if (this.numOfSubscribers < 200) {
            return Optional.empty();
        } else {
            return Optional.of(new MemberShip());
        }
    }

}

/*
    옵셔널 주의점
    - 옵셔널은 반환 타입으로만 사용 -> 메소드 파라미터에 사용 금지
    - 컬렉션을 옵셔널로 감싸지 말자.
    - 옵셔널 반환 시 null로 반환하지 말자.
    - OptionalInt, OptionalLong
 */