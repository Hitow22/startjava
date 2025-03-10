package com.startjava.lesson_2_3_4.array;

public class Sorter {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        String result = sorter.sort('0', '9', true);
        sorter.print(result);

        result = sorter.sort('/', '!', false);
        sorter.print(result);

        result = sorter.sort('A', 'J', false);
        sorter.print(result);
    }

    private String sort(char start, char end, boolean destination) {
        if (start >= end) {
            return String.format("Ошибка: левая граница (%c) > правой (%c)\n", start, end);
        }
        StringBuilder sb = new StringBuilder();
        int levels = end - start + 1;
        for (int i = 0; i < levels; i++) {
            char currentChar = destination ? (char) (start + i) : (char) (end - i);

            String spaces = " ".repeat(levels - i - 1);
            String chars = String.valueOf(currentChar).repeat(2 * i + 1);
            sb.append(spaces).append(chars).append("\n");
        }
        return sb.toString();
    }

    private void print(String result) {
        System.out.println(result);
    }
}
