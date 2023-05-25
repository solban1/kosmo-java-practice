class Human {
    String name;

    Human() {
        this("홍길동");
    }
    Human(String name) {
        this.name = name;
    }
    
    void print(String s) {
        System.out.println(this.name + " " + s);
    }
    
    void move() {
        this.move(20);
    }
    void move(double speed) {
        System.out.println(speed + " km/s 속도로 움직인다");
    }
}

class SuperMan extends Human {
    SuperMan() {
        super("클락");
    }

    void move() {
        this.move(200000.0);
    }
}

class PepsiMan extends Human {
    PepsiMan() {
        super("펩시맨");
    }
}

public class A2 {
    public static void main(String[] args) {
        /*
         * error == compile time error
         * exception == runtime error
         */
        Human h = new Human("홍길동");
        System.out.println(h.name);
        h.move();
        //((SuperMan)h).move(); // java.lang.ClassCastException: class Human cannot be cast to class SuperMan

        SuperMan s = new SuperMan();
        System.out.println(s.name);
        s.move();
        //PepsiMan ps = (PepsiMan)s; // error: incompatible types: SuperMan cannot be converted to PepsiMan

        Human s2 = new SuperMan();
        s2.move();

        Object s3 = new SuperMan();
        //s3.move(); // error: cannot find symbol
        ((SuperMan)s3).move();

    }
}
