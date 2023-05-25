public class YourException extends Exception {
    YourException() {
        super();
    }

    YourException(String s) {
        super(s);
    }

    void handle() {
        System.out.println("handle YourException");
    }
}
