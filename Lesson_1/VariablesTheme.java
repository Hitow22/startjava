public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte coreThreads = 4;
        System.out.println("Число ядер процессора = " + coreThreads);
        short ram = 16;
        System.out.println("Объем оперативной памяти = " + ram);
        int ssdValue = 1000;
        System.out.println("Объем твердотельного накопителя = " + ssdValue);
        long hddValue = 5000000000L;
        System.out.println("Объем жесткого диска = " + hddValue);
        float coreFrequency = 3.5F;
        System.out.println("Частота ядер процессора = " + coreFrequency);
        double boostCoreFrequency = 4.9;
        System.out.println("Частота ядер процессора в разгоне = " + boostCoreFrequency);
        char compGrade = 'A';
        System.out.println("Рейтинг компьютера = " + compGrade);
        boolean isCompOn = true;
        System.out.println("Компьютер включен? = " + isCompOn);

        System.out.println(" ");
        System.out.println("2. Расчет стоимости товара со скидкой");
        double penCost = 105.5;
        double bookCost = 235.83;
        double discountSum = (penCost + bookCost) / 100.0 * 11;
        double discountCost = (penCost + bookCost) - discountSum;
        System.out.println("Стоимость ручки без скидки = " + penCost + " рублей");
        System.out.println("Стоимость книги без скидки = " + bookCost + " рублей");
        System.out.println("Сумма скидки = " + discountSum + " рублей");
        System.out.println("Стоимость товаров со скидкой = " + discountCost + " рублей");

        System.out.println(" ");
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a ");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println(" ");
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte byteMaxValue = 127;
        System.out.println("Максимальное значение byte = " + byteMaxValue);
        byteMaxValue++;
        System.out.println("Значение byte после инкремента = " + byteMaxValue);
        byteMaxValue--;
        System.out.println("Значение byte после декремента = " + byteMaxValue);
        short shortMaxValue = 32767;
        System.out.println("Максимальное значение short = " + shortMaxValue);
        shortMaxValue++;
        System.out.println("Значение short после инкремента = " + shortMaxValue);
        shortMaxValue--;
        System.out.println("Значение short после декремента = " + shortMaxValue);
        int intMaxValue = 2_147_483_647;
        System.out.println("Максимальное значение int = " + intMaxValue);
        intMaxValue++;
        System.out.println("Значение int после инкремента = " + intMaxValue);
        intMaxValue--;
        System.out.println("Значение int после декремента = " + intMaxValue);
        long longMaxValue = 9_223_372_036_854_775_807L;
        System.out.println("Максимальное значение long = " + longMaxValue);
        longMaxValue++;
        System.out.println("Значение long после инкремента = " + longMaxValue);
        longMaxValue--;
        System.out.println("Значение long после декремента = " + longMaxValue);

        System.out.println(" ");
        System.out.println("5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Исходные значения: num1 = " + num1 + ", num2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Перестановка с помощью третьей переменной: num1 = " + num1 +
                ", num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Перестановка с помощью арифметических операций: num1 = " + num1 +
                ", num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Перестановка с помощью побитовой операции ^: num1 = " + num1 +
                ", num2 = " + num2);

        System.out.println(" ");
        System.out.println("6. Вывод символов и их кодов");
        char symbol1 = '$';
        char symbol2 = '*';
        char symbol3 = '@';
        char symbol4 = '|';
        char symbol5 = '~';
        System.out.println("Код символа = " + (int) symbol1 + ", символ = " + symbol1);
        System.out.println("Код символа = " + (int) symbol2 + ", символ = " + symbol2);
        System.out.println("Код символа = " + (int) symbol3 + ", символ = " + symbol3);
        System.out.println("Код символа = " + (int) symbol4 + ", символ = " + symbol4);
        System.out.println("Код символа = " + (int) symbol5 + ", символ = " + symbol5);

        System.out.println(" ");
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
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

        System.out.println(" ");
        System.out.println("8. Манипуляции с сотнями, десятками и единицами числа");
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

        System.out.println(" ");
        System.out.println("9. Перевод секунд в часы, минуты и секунды");
        int totalSeconds = 86399;
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.printf("Время: %02d:%02d:%02d", hours, minutes, seconds);
    }
}