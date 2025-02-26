package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaegerOne = new Jaeger();
        jaegerOne.setModelName("Gipsy Danger");
        jaegerOne.setMark("Mark-3");
        jaegerOne.setOrigin("USA");
        jaegerOne.setHeight(79.25f);
        jaegerOne.setWeight(1.980f);
        jaegerOne.setSpeed(7);
        jaegerOne.setStrength(8);
        jaegerOne.setArmor(6);

        System.out.println(jaegerOne);
        System.out.println(jaegerOne.getModelName() + ":");
        jaegerOne.drift();
        jaegerOne.move();
        jaegerOne.scanKaiju();
        jaegerOne.useVortexCannon();

        System.out.println();
        Jaeger jaegerTwo = new Jaeger("Crimson Typhoon", "Mark-4", "China", 76.2f,
                1.722f, 9, 8, 6);
        System.out.println(jaegerTwo);

        System.out.println(jaegerTwo.getModelName() + ":");
        jaegerTwo.drift();
        jaegerTwo.move();
        jaegerTwo.scanKaiju();
    }
}
