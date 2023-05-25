public class A2 {
    private static boolean err;

    private static void test() throws MyException {
        if (err) {
            throw new MyException();
        }
    }

    public static void main(String[] args) {
        err = true;
        try {
            test();
        } catch (MyException e) {
            System.out.println(e);
            e.handle();
        }
    }
    
}
