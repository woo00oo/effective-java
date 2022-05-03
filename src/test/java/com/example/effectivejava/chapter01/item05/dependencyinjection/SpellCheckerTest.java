package com.example.effectivejava.chapter01.item05.dependencyinjection;

import com.example.effectivejava.chapter01.item05.DefaultDictionary;
import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class SpellCheckerTest {

    @Test
    void isValid() {
        SpellChecker spellChecker = new SpellChecker(DefaultDictionary::new);
    }

}