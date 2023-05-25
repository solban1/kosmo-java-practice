public class C2 {
    public static void main(String[] args) {
        do {
            try {
                System.out.println("before exception");
                Thrower.my();
                System.out.println("after exception");
            } catch (MyException e) {
                System.out.println("catch");
                break; // *** Finally block runs, then breaks ***
            } finally {
                System.out.println("finally");
                continue;
            }
            //System.out.println("out of try block");
        } while (false);

        System.out.println("out of loop");
    }
}
