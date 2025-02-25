package com.startjava.Lesson_2_3.method.naming;

public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(MethodName.getCurr() +
                "() -> программа выполняется далее или завершается?");
        return true;
    }

    public boolean isFileExists() {
        System.out.println(MethodName.getCurr() +
                "() -> удалился ли файл на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(MethodName.getCurr() +
                "() -> последовательность содержит уникальную цифру?");
        return true;
    }

    public boolean isLetter() {
        System.out.println(MethodName.getCurr() +
                "() -> пользователь ввел букву или что-то другое?");
        return false;
    }

    public boolean hasEqualsDigits() {
        System.out.println(MethodName.getCurr() +
                "() -> в проверяемых числах, есть равные цифры?");
        return true;
    }

    public boolean hasAttemptsInGame() {
        System.out.println(MethodName.getCurr() +
                "() -> в игре \"Марио\" остались попытки?");
        return false;
    }

    public boolean isEmptyString() {
        System.out.println(MethodName.getCurr() +
                "() -> пользователь ввёл пустую строку или из одних пробелов?");
        return true;
    }

    public boolean isDiceRollEven() {
        System.out.println(MethodName.getCurr() +
                "() -> на кубике, который бросил компьютер, выпало четное число?");
        return false;
    }

    public boolean isPathCorrect() {
        System.out.println(MethodName.getCurr() +
                "() -> путь до файла, который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(MethodName.getCurr() +
                "() -> файл по указанному адресу существует?");
        return false;
    }
}
