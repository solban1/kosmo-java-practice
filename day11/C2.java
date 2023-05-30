public class C2 {
    public static void main(String[] args) {
        C2C c = new C2C();
        C2C cc = new C2CC();
        C2CC ccc = new C2CC();
        System.out.printf("%d %d %d\n", c.age, cc.age, ccc.age); // 10 10 20
        System.out.println(ccc.superAge());

        ccc.m(); // C2CC m()
        ccc.superM(); // C2C m()
    }
}

class C2C {
    int age = 10;

    void m() {
        System.out.println("C2C m()");
    }
}

class C2CC extends C2C {
    int age = 20;

    int superAge() {
        return super.age;
    }

    void m() {
        System.out.println("C2CC m()");
    }

    void superM() {
        super.m();
    }
}