public class A5 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Intentional Exception");
        } catch (RuntimeException e) {
            System.err.println(e);
        }
    }
}
