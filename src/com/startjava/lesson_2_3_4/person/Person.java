package com.startjava.lesson_2_3.person;

public class Person {
    
    String sex = "мужской";
    String name = "Андрей";
    float height = 1.7f;
    float weight = 67.5f;
    int age = 25;

    void walk() {
        System.out.println(" может ходить");
    }

    void sit() {
        System.out.println(" может сидеть");
    }

    void run() {
        System.out.println(" может бегать");
    }

    void speak() {
        System.out.println(" может говорить");
    }

    void learnJava() {
        System.out.println(" может учить Java");
    }
}

