public class E5 {
    public static void main(String[] args) {
        abstract class A {
            abstract void m();
        }

        class AA extends A {
            void m() {
                System.out.println("m()");
            }
        }

        new AA().m();
    }
}
