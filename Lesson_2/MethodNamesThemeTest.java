public class MethodNamesThemeTest {
    public static void main(String[] args) {
        System.out.println("1. Hе boolean-методы");
        printNonBooleanMethods();
        System.out.println("\n2. boolean-методы");
        printBooleanMethods();
    }

    private static void printNonBooleanMethods() {
        NonBooleanMethods nonBm = new NonBooleanMethods();

        nonBm.findLongestWord();
        nonBm.selectEditorMenuItem();
        nonBm.calculateAverageMark();
        nonBm.countUniqueBookWords();
        nonBm.displayErrorMessage();
        nonBm.syncWithCloud();
        nonBm.restoreFromBackup();
        nonBm.stopMusicLoading();
        nonBm.resetVacuumSettings();
        nonBm.writeToFile();
        nonBm.convertCelsiusToFahrenheit();
        nonBm.inputMathExpr();
        nonBm.determineRaceWinner();
        nonBm.findBookByAuthor();
    }

    private static void printBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();

        System.out.println(bm.isProgramRunning());
        System.out.println(bm.isFileOnDriveDeleted());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isUserInputLetter());
        System.out.println(bm.hasEqualsDigits());
        System.out.println(bm.hasAttemptsInGame());
        System.out.println(bm.isUserInputEmptyString());
        System.out.println(bm.isDiceRollEven());
        System.out.println(bm.isSsdPathCorrect());
        System.out.println(bm.isFileExist());
    }
}