public class B4 {
    String name;

    B4() {
        this("fdsa");
    }
    B4(String name) {
        this.name = name;
        new B4User(this).use();
    }

    void m() {
        System.out.println("m()");
    }

    public static void main(String[] args) {
        new B4();
    }
}

class B4User {
    B4 b;

    B4User(B4 b) {
        this.b = b;
    }

    void use() {
        b.m();
        System.out.println("b.name: " + b.name);
    }
}
