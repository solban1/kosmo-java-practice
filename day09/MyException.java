public class MyException extends Exception {
    MyException() {
        super();
    }

    MyException(String s) {
        super(s);
    }

    void handle() {
        System.out.println("handle MyException");
    }
}
