class MyError extends VirtualMachineError {
    MyError(Throwable cause) {
        super(cause);
    }
}

public class A3 {
    public static void main(String[] args) {
        throw new MyError(new UnknownError("CRITICAL DAMAGE"));
    }
}
