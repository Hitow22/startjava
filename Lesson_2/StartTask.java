public class StartTask {
    public static void main(String[] args) {
        System.out.println("1. Hе boolean-методы");
        getNonBooleanMethods();
        System.out.println("\n2. boolean-методы");
        getBooleanMethods();
    }

    static void getNonBooleanMethods() {
        NonBooleanMethods nonBooleanMethods = new NonBooleanMethods();

        nonBooleanMethods.findLongestBookWord();
        nonBooleanMethods.selectEditorMenuItem();
        nonBooleanMethods.calculateMedianMark();
        nonBooleanMethods.countUniqueBookWords();
        nonBooleanMethods.displayErrorMessage();
        nonBooleanMethods.syncDataWithCloud();
        nonBooleanMethods.restoreDataFromBackup();
        nonBooleanMethods.stopMp3Loading();
        nonBooleanMethods.resetVacuumSettings();
        nonBooleanMethods.writeToFileOnFlash();
        nonBooleanMethods.convertCelsiusToFahrenheit();
        nonBooleanMethods.inputThreeArgExpression();
        nonBooleanMethods.getRaceGameWinner();
        nonBooleanMethods.findBookByAuthor();
    }

    static void getBooleanMethods() {
        BooleanMethods booleanMethods = new BooleanMethods();

        booleanMethods.isProgramRunning();
        booleanMethods.isFileOnDriveDeleted();
        booleanMethods.hasUniqueDigit();
        booleanMethods.isUserInputLetter();
        booleanMethods.hasEqualsDigits();
        booleanMethods.hasAttemptsInGame();
        booleanMethods.isUserInputEmptyString();
        booleanMethods.isDiceRollEven();
        booleanMethods.isSsdPathCorrect();
        booleanMethods.isFileExist();
    }
}