class C3 {
    int age = 10;
    String name;
    C3(String name) {
        this.name = name;
    }

    void m() {
        System.out.println("C3 m()");
    }
}

class C3Child extends C3 {
    int age = 20;

    C3Child() {
        super("abcd");
    }
    
    void m() {
        System.out.println("C3Child m()");
    }

    void show() {
        System.out.println("age: " + age);
        System.out.println("age: " + super.age);
        System.out.println("name: " + name);
        m();
        super.m();
    }
}

class C3User {
    public static void main(String[] args) {
        new C3Child().show();
    }
}
