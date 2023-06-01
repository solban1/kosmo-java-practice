abstract class F5A {
    abstract void m1();
    final void m2() {
        System.out.println("This method shall not change");
    }
}

public class F5 {
    static F5A a = new F5A() {
        void m1() {
            System.out.println("m1()");
        }
    };

    public static void main(String[] args) {
        a.m1();
        a.m2();
    }
    
}
