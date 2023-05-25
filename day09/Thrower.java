public class Thrower {
    public static void my() throws MyException{
        throw new MyException();
    }
    public static void your() throws YourException {
        throw new YourException();
    }
    public static void ex() throws Exception {
        throw new Exception();
    }
}
