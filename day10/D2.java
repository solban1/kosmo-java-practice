abstract class D2Abs {
    abstract void am();
    abstract void am2();
    // static abstract void asm(); // error: illegal combination of modifiers: abstract and static
    
    void m() {
        System.out.println("m()");
    }

    static void sm() {
        System.out.println("sm()");
    }
}

abstract class D2Child extends D2Abs {
    void am() {
        System.out.println("am()");
    }
}

class D2Child2 extends D2Child {
    void am2() {
        System.out.println("am2()");
    }
}

public class D2 {
    
    public static void main(String[] args) {
        //D2Abs d = new D2Abs(); // error: D2Abs is abstract; cannot be instantiated
        D2Abs.sm(); // OK
        new D2Child2().am();
        D2Abs d = new D2Child2();
        d.am();
        d.am2();
    }
}
