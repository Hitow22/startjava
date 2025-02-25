package com.startjava.Lesson_2_3.method.naming;

public class MethodNamesThemeTest {
    public static void main(String[] args) {
        System.out.println("1. Hе boolean-методы");
        execNonBooleanMethods();
        System.out.println("\n2. boolean-методы");
        execBooleanMethods();
    }

    private static void execNonBooleanMethods() {
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

    private static void execBooleanMethods() {
        BooleanMethods bm = new BooleanMethods();

        System.out.println(bm.isProgramRunning());
        System.out.println(bm.isFileExists());
        System.out.println(bm.hasUniqueDigit());
        System.out.println(bm.isLetter());
        System.out.println(bm.hasEqualsDigits());
        System.out.println(bm.hasAttemptsInGame());
        System.out.println(bm.isEmptyString());
        System.out.println(bm.isDiceRollEven());
        System.out.println(bm.isPathCorrect());
        System.out.println(bm.isFileExist());
    }
}