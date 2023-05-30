public class B2 {
    static int s;
    int d;

    void dm() {
        System.out.println(++s);
        System.out.println(++d);
    }

    static void sm() {
        System.out.println(++s);
    }

    public static void main(String[] args) {
        B2 b = new B2();
        b.dm();
        sm();

        System.out.println(B2.s);
        System.out.println(s); // 같은 클래스 내에서만 가능
        System.out.println(b.s); // warning: The static field B2.s should be accessed in a static way
    } 
}
