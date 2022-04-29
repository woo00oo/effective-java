package com.example.effectivejava.chapter01.item03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.lang.annotation.Inherited;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ConcertTest {

    @Mock
    Elvis elvis;

    @Test
    void perform() {
        Concert concert = new Concert(elvis);
        concert.perform();

        assertTrue(concert.isLightsOn());
        assertTrue(concert.isMainStateOpen());
    }

}

/*
    Elvis라는 객체가 비싼 객체라면 테스트를 실행하는데 비효율적이다.
    (외부 통신, DB 통신 등등)
 */