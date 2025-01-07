public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(MethodNameCall.getMethodName() + "() -> программа выполняется далее" +
                " или завершается?");
        return true;
    }

    public boolean isFileOnDriveDeleted() {
        System.out.println(MethodNameCall.getMethodName() + "() -> удалился ли файл" +
                " на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(MethodNameCall.getMethodName() + "() -> последовательность содержит" +
                " уникальную цифру?");
        return true;
    }

    public boolean isUserInputLetter() {
        System.out.println(MethodNameCall.getMethodName() + "() -> пользователь ввел букву" +
                " или что-то другое?");
        return false;
    }

    public boolean hasEqualsDigits() {
        System.out.println(MethodNameCall.getMethodName() + "() -> в проверяемых числах," +
                " есть равные цифры?");
        return true;
    }

    public boolean hasAttemptsInGame() {
        System.out.println(MethodNameCall.getMethodName() + "() -> в игре \"Марио\" " +
                "остались попытки?");
        return false;
    }

    public boolean isUserInputEmptyString() {
        System.out.println(MethodNameCall.getMethodName() + "() -> пользователь ввёл пустую строку" +
                " или из одних пробелов?");
        return true;
    }

    public boolean isDiceRollEven() {
        System.out.println(MethodNameCall.getMethodName() + "() -> на кубике, который бросил компьютер," +
                " выпало четное число?");
        return false;
    }

    public boolean isSsdPathCorrect() {
        System.out.println(MethodNameCall.getMethodName() + "() -> путь до файла," +
                " который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(MethodNameCall.getMethodName() + "() -> файл по указанному адресу существует?");
        return false;
    }
}
