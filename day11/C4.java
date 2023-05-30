class C4 {
    int age = 10;
    String name;
    
    C4(String name) {
        this.name = name;
    }

    void m() {
        System.out.println("C4 m()");
    }
}

class C4Child extends C4 {
int age = 20;

    C4Child() {
        super("C4");
    }

    void m() {
        System.out.println("C4Child m()");
    }

    void show() {
        System.out.println("age: " + age);
        System.out.println("age: " + super.age);
        System.out.println("name: " + name);
        m();
        super.m();
    }
}

class C4User {
    public static void main(String[] args) {
        new C4Child().show();
    }
}
