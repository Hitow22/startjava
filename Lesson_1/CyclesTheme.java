public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int rangeStart = -10;
        int rangelEnd = 21;
        int counter = rangeStart;
        int sumEven = 0;
        int sumOdd = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
            counter++;
        } while (counter <= rangelEnd);
        System.out.println("В отрезке [" + rangeStart + ", " + rangelEnd + "] сумма четных чисел = " + 
                sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\n2. Вывод чисел между min и max в порядке убывания");
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        int max = number1;
        int min = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        if (number2 < min) {
            min = number2;
        }
        if (number3 < min) {
            min = number3;
        }
        System.out.print("Числа в интервале (" + min + ", " + max + ") в порядке убывания: ");
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        number3 = 1234;
        int sumNumbers = 0;
        System.out.print("Число в обратном порядке = ");
        while (number3 > 0) {
            int lastNumber = number3 % 10;
            sumNumbers += lastNumber;
            System.out.print(lastNumber);
            number3 /= 10;
        }
        System.out.println("\nСумма выделенных цифр = " + sumNumbers);

        System.out.println("\n4. Вывод чисел в несколько строк");
        rangeStart = 1;
        rangelEnd = 24;
        int numbersPerLine = 5;
        counter = 0;
        boolean hasPrinted = false;
        for (int i = rangeStart; i < rangelEnd; i += 2) {
            System.out.printf("%4d", i);
            counter++;
            hasPrinted = true;
            if (counter == numbersPerLine) {
                System.out.println();
                counter = 0;
                hasPrinted = false;
            }
        }
        if (counter > 0 && hasPrinted) {
            for (int j = counter; j < numbersPerLine; j++) {
                System.out.printf("%4d", 0);
            }
            System.out.println();
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        number3 = 3242592;
        System.out.print("В " + number3);
        int countTwos = 0;
        while (number3 > 0) {
            if (number3 % 10 == 2) {
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
        counter = 0;
        for (int i = 0; i < 50; i++) {
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

        symbolLimit = 3;
        int currentRow = 1;
        do {
            int indexCounter = 0;
            do {
                System.out.print("$");
                indexCounter++;
            } while (indexCounter < currentRow);

            System.out.println();
            currentRow++;
        } while (currentRow <= symbolLimit);
        currentRow = symbolLimit - 1;
        do {
            int indexCounter = 0;
            do {
                System.out.print("$");
                indexCounter++;
            } while (indexCounter < currentRow);
            System.out.println();
            currentRow--;
        } while (currentRow > 0);

        System.out.println("\n7. Вывод ASCII-символов");
        rangeStart = 33;
        rangelEnd = 48;
        System.out.println("DECIMAL   CHARACTER   DESCRIPTION");
        for (int i = rangeStart; i < rangelEnd; i++) {
            if (i % 2 != 0) {
                System.out.printf("%4d%10c%13s%-1s%n", i, (char) i, " ", Character.getName(i));
            }
        }
        rangeStart = 97;
        rangelEnd = 123;
        System.out.println("\nDECIMAL   CHARACTER   DESCRIPTION");
        for (int i = rangeStart; i < rangelEnd; i++) {
            if (i % 2 == 0) {
                System.out.printf("%4d%10c%13s%-1s%n", i, (char) i, " ", Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        number3 = 1234321;
        int originalNumber = number3;
        int reversedNumber = 0;
        while (number3 > 0) {
            int lastNumber = number3 % 10;
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
            int lastNumber = number3 % 10;
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
        rangeStart = 2;
        rangelEnd = 9;
        System.out.printf("%21s", "ТАБЛИЦА ПИФАГОРА\n");
        System.out.print("   |");
        for (int i = rangeStart; i <= rangelEnd; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n--------------------------------------");
        for (int i = rangeStart; i <= rangelEnd; i++) {
            System.out.printf("%2d |", i);
            for (int j = rangeStart; j <= rangelEnd; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
