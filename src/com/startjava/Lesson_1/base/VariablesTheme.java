package com.startjava.Lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte coreThreads = 4;
        System.out.println("Число ядер процессора = " + coreThreads);
        short ramValue = 16;
        System.out.println("Объем оперативной памяти = " + ramValue);
        int ssdValue = 1000;
        System.out.println("Объем твердотельного накопителя = " + ssdValue);
        long hddValue = 5000000000L;
        System.out.println("Объем жесткого диска = " + hddValue);
        float coreFrequency = 3.5F;
        System.out.println("Частота ядер процессора = " + coreFrequency);
        double boostCoreFrequency = 4.9;
        System.out.println("Частота ядер процессора в разгоне = " + boostCoreFrequency);
        char computerGrade = 'A';
        System.out.println("Рейтинг компьютера = " + computerGrade);
        boolean isComputerOn = true;
        System.out.println("Компьютер включен? = " + isComputerOn);

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double penCost = 105.5;
        double bookCost = 235.83;
        double discountSum = (penCost + bookCost) / 100.0 * 11;
        double discountCost = (penCost + bookCost) - discountSum;
        System.out.println("Стоимость ручки без скидки = " + penCost + " рублей");
        System.out.println("Стоимость книги без скидки = " + bookCost + " рублей");
        System.out.println("Сумма скидки = " + discountSum + " рублей");
        System.out.println("Стоимость товаров со скидкой = " + discountCost + " рублей");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = 127;
        System.out.println("Максимальное значение byte = " + byteMaxValue);
        System.out.println("Значение byte после инкремента = " + ++byteMaxValue);
        System.out.println("Значение byte после декремента = " + --byteMaxValue);
        short shortMaxValue = 32767;
        System.out.println("Максимальное значение short = " + shortMaxValue);
        System.out.println("Значение short после инкремента = " + ++shortMaxValue);
        System.out.println("Значение short после декремента = " + --shortMaxValue);
        int intMaxValue = 2_147_483_647;
        System.out.println("Максимальное значение int = " + intMaxValue);
        System.out.println("Значение int после инкремента = " + ++intMaxValue);
        System.out.println("Значение int после декремента = " + --intMaxValue);
        long longMaxValue = 9_223_372_036_854_775_807L;
        System.out.println("Максимальное значение long = " + longMaxValue);
        System.out.println("Значение long после инкремента = " + ++longMaxValue);
        System.out.println("Значение long после декремента = " + --longMaxValue);

        System.out.println("\n5. Перестановка значений переменных");
        int number1 = 2;
        int number2 = 5;
        System.out.println("Исходные значения: number1 = " + number1 + ", number2 = " + number2);
        int temp = number1;
        number1 = number2;
        number2 = temp;
        System.out.println("Перестановка с помощью третьей переменной: number1 = " + number1 +
                ", number2 = " + number2);
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        System.out.println("Перестановка с помощью арифметических операций: number1 = " + number1 +
                ", number2 = " + number2);
        number1 ^= number2;
        number2 ^= number1;
        number1 ^= number2;
        System.out.println("Перестановка с помощью побитовой операции ^: number1 = " + number1 +
                ", number2 = " + number2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println("Код символа = " + (int) dollar + ", символ = " + dollar);
        System.out.println("Код символа = " + (int) asterisk + ", символ = " + asterisk);
        System.out.println("Код символа = " + (int) atSign + ", символ = " + atSign);
        System.out.println("Код символа = " + (int) verticalBar + ", символ = " + verticalBar);
        System.out.println("Код символа = " + (int) tilde + ", символ = " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char openParen = '(';
        char closeParen = ')';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + openParen + " " + closeParen + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash +
                backslash + underscore + underscore + backslash);

        System.out.println("\n8. Манипуляции с сотнями, десятками и единицами числа");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int mult = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:");
        System.out.println("  сотен - " + hundreds);
        System.out.println("  десятков - " + tens);
        System.out.println("  единиц - " + ones);
        System.out.println("Сумма разрядов = " + sum);
        System.out.println("Произведение разрядов = " + mult);

        System.out.println("\n9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hh = totalSeconds / 3600;
        int mm = (totalSeconds % 3600) / 60;
        int ss = totalSeconds % 60;
        System.out.printf("Время: %02d:%02d:%02d", hh, mm, ss);
    }
}