package com.example.effectivejava.chapter01.item03.methodreference;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Person {

    private LocalDate birthday;

    public Person(){
    }

    public Person(LocalDate birthday) {
        this.birthday = birthday;
    }

    // 임의 객체의 메소드 레퍼런스
    public int compareByAge(Person b) {
        return this.birthday.compareTo(b.birthday);
    }

    // 스태틱 메소드 레퍼런스
    public static int compareByAge2(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    // 인스턴스 메소드 레퍼런스
    public int compareByAge3(Person a, Person b) {
        return a.birthday.compareTo(b.birthday);
    }

    public static void main(String[] args) {
        Person person = new Person();
        List<Person> people = new ArrayList<>();
        people.add(new Person(LocalDate.of(1982, 7, 15)));
        people.add(new Person(LocalDate.of(2011, 3, 2)));
        people.add(new Person(LocalDate.of(2013, 1, 28)));

        people.sort(Person::compareByAge);

        people.sort(Person::compareByAge);

        people.sort(person::compareByAge3);

        // 생성자 래퍼런스
        Function<LocalDate, Person> aNew = Person::new;

    }
}
