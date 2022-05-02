package com.example.effectivejava.chapter01.item03.functionalinterface;

import com.example.effectivejava.chapter01.item03.methodreference.Person;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class DefaultFunctions {

    public static void main(String[] args) {
        Function<Integer, String> inToString = (i) -> "hello";
        Supplier<Person> personSupplier = Person::new;
        Consumer<Integer> integerConsumer = System.out::println;
        Predicate<String> stringPredicate;

    }
}
