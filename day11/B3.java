public class B3 {
    String name;

    B3() {
        this("dltnstls");
    }
    B3(String name) {
        this.name = name;
        new B3User(this).use();
    }

    void m() {
        System.out.println("m()");
    }

    public static void main(String[] args) {
        new B3();
    }
}

class B3User {
    B3 b;
    
    B3User(B3 b) {
        this.b = b;
    }

    void use() {
        b.m();
        System.out.println("b.name: " + b.name);
    }
}
