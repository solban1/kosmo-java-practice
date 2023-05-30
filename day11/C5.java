class C5 {
    int age = 10;
    String name;
    
    C5(String name) {
        this.name = name;
    }

    void m() {
        System.out.println("C5 m()");
    }
}

class C5Child extends C5 {
    int age = 20;

    C5Child() {
        super("aefji");
    }

    void m() {
        System.out.println("C5Child m()");
    }

    void show() {
        System.out.println("age: " + age);
        System.out.println("age: " + super.age);
        System.out.println("name: " + name);
        m();
        super.m();
    }
}

class C5User {
    public static void main(String[] args) {
        new C5Child().show();
    }
}