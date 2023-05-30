public class B2 {
    String name;

    B2() {
        this("길동");
    }
    B2(String name) {
        this.name = name;
    }

    void callName() {
        new B2B(this).call();  // 자신의 객체의 레퍼런스 전달
    }

    public static void main(String[] args) {
        B2 b = new B2("J");
        b.callName();
    }
}

class B2B {
    B2 b;

    B2B(B2 b) {
        this.b = b;
    }

    void call() {
        System.out.println(b.name);
    }
}
