public class B4 {
    public static void main(String[] args) throws MyException, YourException, Exception{
        Thrower.your(); // throws here
        try {
            Thrower.my();
            Thrower.ex();
        } catch (MyException e) {
            System.out.println("MyException");
        }
        
    }
}
