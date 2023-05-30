public class B5 {
    String name;

    B5() {
        this("ghdrlfehd");
    }
    B5(String name) {
        this.name = name;
        new B5User(this).use();
    }

    void m() {
        System.out.println("m()");
    }
    
    public static void main(String[] args) {
        new B5("abcd");
    }
}

class B5User {
    B5 b;
    
    B5User(B5 b) {
        this.b = b;
    }

    void use() {
        b.m();
        System.out.println("b.name: " + b.name);
    }
}