package com.example.effectivejava.chapter01.item05.dependencyinjection;

import com.example.effectivejava.chapter01.item05.Dictionary;

import java.util.List;
import java.util.function.Supplier;

public class SpellChecker {

    private final Dictionary dictionary;

    public SpellChecker(Supplier<? extends Dictionary> supplier) {
        this.dictionary = supplier.get();
    }

    public boolean isValid(String word) {
        // SpellChecker 코드
        return dictionary.contains(word);
    }

    public List<String> suggestions(String typo) {
        // SpellChecker 코드
        return dictionary.closeWordsTo(typo);
    }
}
