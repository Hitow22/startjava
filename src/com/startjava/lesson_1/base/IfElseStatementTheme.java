package com.startjava.lesson_1.base;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean mailGender = true;
        if (!mailGender) {
            System.out.println("Это женщина");
        } else {
            System.out.println("Это мужчина");
        }
        int age = 22;
        if (age > 18) {
            System.out.println("Это совершеннолетний человек");
        } else {
            System.out.println("Это несовершеннолетний человек");
        }
        double height = 2.1;
        if (height < 1.8) {
            System.out.println("Это невысокий человек");
        } else {
            System.out.println("Это высокий человек");
        }
        char firstNameLetter = "Alex".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Первая буква имени это \"М\"");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква имени это \"I\"");
        } else {
            System.out.println("Первая буква имени не \"М\" и не \"I\"");
        }

        System.out.println("\n2. Поиск большего числа");
        int firstNumber = 7;
        int secondNumber = 11;
        if (firstNumber > secondNumber) {
            System.out.println("Число " + firstNumber + " больше числа " + secondNumber);
        } else if (firstNumber < secondNumber) {
            System.out.println("Число " + secondNumber + " больше числа " + firstNumber);
        } else {
            System.out.println("Числа " + firstNumber + " и " + secondNumber + " равны");
        }

        System.out.println("\n3. Проверка числа");
        int number = 9;
        if (number == 0) {
            System.out.println(number + " является нулем");
        } else {
            if (number > 0) {
                System.out.print(number + " является положительным");
            } else {
                System.out.print(number + " является отрицательным");
            }
            if (number % 2 == 0) {
                System.out.println(" и четным");
            } else {
                System.out.println(" и нечетным");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        firstNumber = 123;
        secondNumber = 223;
        int hundreds1 = firstNumber / 100;
        int hundreds2 = secondNumber / 100;
        int tens1 = firstNumber / 10 % 10;
        int tens2 = secondNumber / 10 % 10;
        int ones1 = firstNumber % 10;
        int ones2 = secondNumber % 10;
        if (hundreds1 != hundreds2 && tens1 != tens2 && ones1 != ones2) {
            System.out.println("Одинаковые цифры в числах отсутствуют");
        } else {
            System.out.println("Исходные числа: " + firstNumber + " и " + secondNumber);
            if (hundreds1 == hundreds2) {
                System.out.println("В числах есть одинаковая цифра: " + hundreds1 + " в разряде 3");
            }
            if (tens1 == tens2) {
                System.out.println("В числах есть одинаковая цифра: " + tens1 + " в разряде 2");
            }
            if (ones1 == ones2) {
                System.out.println("В числах есть одинаковая цифра: " + ones1 + " в разряде 1");
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char testChar = '\u0057';
        if (testChar >= 'A' && testChar <= 'Z') {
            System.out.println("'" + testChar + "' - большая буква");
        } else if (testChar >= 'a' && testChar <= 'z') {
            System.out.println("'" + testChar + "' - маленькая буква");
        } else if (testChar >= '0' && testChar <= '9') {
            System.out.println("'" + testChar + "' - цифра");
        } else {
            System.out.println("'" + testChar + "' - ни буква и ни цифра");
        }

        System.out.println("\n6. Подсчет начисленных банком %");
        double deposit = 321123.59;
        double percentage = 0.1;
        if (deposit < 100000) {
            percentage = 0.05;
        } else if (deposit >= 100000 && deposit <= 300000) {
            percentage = 0.07;
        }
        double sumPercentage = deposit * percentage;
        double totalAmount = deposit + sumPercentage;
        System.out.println("Сумма вклада = " + deposit);
        System.out.println("Сумма начисленного % = " + sumPercentage);
        System.out.println("Итоговая сумма с процентом = " + totalAmount);

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 59;
        double historyGrade = 5;
        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent > 60) {
            historyGrade = 3;
        } else if (historyPercent > 73) {
            historyGrade = 4;
        }
        double programmingPercent = 92;
        double programmingGrade = 5;
        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent > 60) {
            programmingGrade = 3;
        } else if (programmingPercent > 73) {
            programmingGrade = 4;
        }
        double medianPercent = (historyPercent + programmingPercent) / 2;
        double medianGrade = (historyGrade + programmingGrade) / 2;
        System.out.println("Оценка по истории = " + historyGrade);
        System.out.println("Оценка по программированию = " + programmingGrade);
        System.out.println("Средний балл оценок по предметам = " + medianGrade);
        System.out.println("Средний % по предметам = " + medianPercent);

        System.out.println("\n8. Расчет годовой прибыли");
        double goodsIncome = 13025.233;
        double rentCost = 5123.018;
        double productionCost = 9001.729;
        double annualIncome = (goodsIncome - rentCost - productionCost) * 12;
        if (annualIncome <= 0) {
            System.out.println("Прибыль за год: " + annualIncome + " руб.");
        } else {
            System.out.println("Прибыль за год: +" + annualIncome + " руб.");
        }
    }
}