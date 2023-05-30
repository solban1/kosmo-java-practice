public class D4 {
    public static void main(String[] args) {
        final class A {}

        new A();

        abstract class B {}
        //new B(); // (X)
    }
}
