public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int end = 21;
        int i = start;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= end);
        System.out.println("В отрезке [" + start + ", " + end + "] сумма четных чисел = " + sumEven +
                 ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = 0;
        int min = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number2 > number1 && number2 > number3) {
            max = number2;
        } else if (number3 > number1 && number3 > number2) {
            max = number3;
        }
        if (number1 < number2 && number1 < number3) {
            min = number1;
        } else if (number2 < number1 && number2 < number3) {
            min = number2;
        } else if (number3 < number1 && number3 < number2) {
            min = number3;
        }
        System.out.print("Числа в интервале (" + min + ", " + max + ") в порядке убывания: ");
        for (int j = max - 1; j > min; j--) {
            System.out.print(j + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number3 = 1234;
        int sumNumbers = 0;
        System.out.print("Число в обратном порядке = ");
        while (number3 > 0) {
            int lastNumber = number3 % 10;
            sumNumbers += lastNumber;
            System.out.print(lastNumber + "");
            number3 /= 10;
        }
        System.out.println("\nСумма выделенных цифр = " + sumNumbers);

        System.out.println("\n4. Вывод чисел в несколько строк");
        start = 1;
        end = 24;
        for (int g = start; g < end; g++) {
            if (g % 2 != 0) {
                System.out.printf("%05d%n", g);
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number3 = 3242592;
        System.out.print("В " + number3);
        int countTwos = 0;
        while (number3 > 0) {
            int lastNumber = number3 % 10;
            if (lastNumber == 2) {
                countTwos++;
            }
            number3 /= 10;
        }
        if (countTwos % 2 == 0) {
            System.out.println(" четное " + "(" + countTwos + ")" + " количество двоек");
        } else {
            System.out.println(" нечетное " + "(" + countTwos + ")" + " количество двоек");
        }

        System.out.println("\n6. Вывод геометрических фигур");
        int symbolLimit = 10;
        int counter = 0;
        for (int j = 0; j < 50; j++) {
            System.out.print('*');
            counter++;
            if (counter == symbolLimit) {
                System.out.println();
                counter = 0;
            }
        }

        symbolLimit = 5;
        while (symbolLimit > 0) {
            int indexCounter = 0;
            while (indexCounter < symbolLimit) {
                System.out.print('#');
                indexCounter++;
                counter++;
            }
            System.out.println();
            symbolLimit--;
        }

        symbolLimit = 0;
        counter = 0;
        do {
            int indexCounter = 0;
            while (indexCounter <= symbolLimit) {
                System.out.print('$');
                indexCounter++;
                counter++;
            }
            System.out.println();
            symbolLimit++;
        } while (symbolLimit < 3);
        symbolLimit = 2;
        do {
            int indexCounter = 0;
            while (indexCounter < symbolLimit) {
                System.out.print('$');
                indexCounter++;
                counter++;
            }
            System.out.println();
            symbolLimit--;
        } while (symbolLimit > 0);

        System.out.println("\n7. Вывод ASCII-символов");
        start = 33;
        end = 48;
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int j = start; j < end; j++) {
            if (j % 2 != 0) {
                System.out.printf("%4d%10c%13s%-1s%n", j, (char) j, " ", Character.getName(j));
            }
        }
        start = 97;
        end = 123;
        System.out.println("\nDECIMAL   CHARACTER   DESCRIPTION");
        for (int j = start; j < end; j++) {
            if (j % 2 == 0) {
                System.out.printf("%4d%10c%13s%-1s%n", j, (char) j, " ", Character.getName(j));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number3 = 1234321;
        int originalNumber = number3;
        int reversedNumber = 0;
        int lastNumber;
        while (number3 != 0) {
            lastNumber = number3 % 10;
            reversedNumber = reversedNumber * 10 + lastNumber;
            number3 /= 10;
        }
        if (originalNumber == reversedNumber) {
            System.out.println(reversedNumber + " палиндром");
        } else {
            System.out.println(reversedNumber + " не палиндром");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        number3 = 654456;
        originalNumber = number3;
        int firstHalfSum = 0;
        int secondHalfSum = 0;
        counter = 0;
        while (number3 > 0) {
            lastNumber = number3 % 10;
            number3 /= 10;
            counter++;
            if (counter > 3) {
                firstHalfSum += lastNumber;
            } else {
                secondHalfSum += lastNumber;
            }
        }
        if (firstHalfSum == secondHalfSum) {
            System.out.println("Число " + originalNumber + " - счастливое");
        } else {
            System.out.println("Число " + originalNumber + " - несчастливое");
        }
        System.out.println("Сумма цифр " + (originalNumber / 1000) + " = " + firstHalfSum);
        System.out.println("Сумма " + (originalNumber % 1000) + " = " + secondHalfSum);

        System.out.println("\n10. Вывод таблицы умножения Пифагора");
        start = 2;
        end = 9;
        System.out.printf("%21s", "ТАБЛИЦА ПИФАГОРА\n");
        System.out.print("   |");
        for (int j = start; j <= end; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();
        System.out.println("--------------------------------------");
        for (int k = start; k <= end; k++) {
            System.out.printf("%2d |", k);
            for (int j = start; j <= end; j++) {
                System.out.printf("%4d", k * j);
            }
            System.out.println();
        }
    }
}