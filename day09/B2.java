public class B2 {
    public static void main(String[] args) {
        try {
            throw new MyException();
        } catch (Throwable th) {
            // TODO: handle exception
        }// catch (MyException e) {} // error: exception MyException has already been caught
    }
}
