public class CurrentMethodName {
    public static String getName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
