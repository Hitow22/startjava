public class MethodName {
    public static String getCurr() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}
