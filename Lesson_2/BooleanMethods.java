public class BooleanMethods {
    public boolean isProgramRunning() {
        System.out.println(CurrentMethodName.getName() + "() -> программа выполняется далее" +
                " или завершается?");
        return true;
    }

    public boolean isFileOnDriveDeleted() {
        System.out.println(CurrentMethodName.getName() + "() -> удалился ли файл" +
                " на жестком диске или флешке?");
        return false;
    }

    public boolean hasUniqueDigit() {
        System.out.println(CurrentMethodName.getName() + "() -> последовательность содержит" +
                " уникальную цифру?");
        return true;
    }

    public boolean isUserInputLetter() {
        System.out.println(CurrentMethodName.getName() + "() -> пользователь ввел букву" +
                " или что-то другое?");
        return false;
    }

    public boolean hasEqualsDigits() {
        System.out.println(CurrentMethodName.getName() + "() -> в проверяемых числах," +
                " есть равные цифры?");
        return true;
    }

    public boolean hasAttemptsInGame() {
        System.out.println(CurrentMethodName.getName() + "() -> в игре \"Марио\" " +
                "остались попытки?");
        return false;
    }

    public boolean isUserInputEmptyString() {
        System.out.println(CurrentMethodName.getName() + "() -> пользователь ввёл пустую строку" +
                " или из одних пробелов?");
        return true;
    }

    public boolean isDiceRollEven() {
        System.out.println(CurrentMethodName.getName() + "() -> на кубике, который бросил компьютер," +
                " выпало четное число?");
        return false;
    }

    public boolean isSsdPathCorrect() {
        System.out.println(CurrentMethodName.getName() + "() -> путь до файла," +
                " который вы ищите на ssd, действительный?");
        return true;
    }

    public boolean isFileExist() {
        System.out.println(CurrentMethodName.getName() + "() -> файл по указанному адресу существует?");
        return false;
    }
}
