package com.startjava.Lesson_2_3.method.naming;

public class MethodName {
    public static String getCurr() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
