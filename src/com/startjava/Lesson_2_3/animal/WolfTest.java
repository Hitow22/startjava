package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setSex("самец");
        wolf.setName("Ауф");
        wolf.setWeight(54.4f);
        wolf.setAge(6);
        wolf.setColor("серый");

        System.out.println("Пол = " + wolf.getSex());
        System.out.println("Кличка = " + wolf.getName());
        System.out.println("Вес = " + wolf.getWeight() + " кг");
        System.out.println("Возраст = " + wolf.getAge() + " лет");
        System.out.println("Окрас = " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}
