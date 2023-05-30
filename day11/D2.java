public class D2 {
    
}

class D2C {
    String m() {
        return "D2C";
    }
}

class D2CChild extends D2C {
    String m() { // overriding
        return "D2CChild";
    }
    String m(int i) { // *** overloading, not overriding ***
        return "D2CChild " + i;
    }
    // private String m() {} // not OK
    // protected String m() {} // OK
    // public String m() {} // OK
    // 자식 메소드의 접근제한자가 더 좁을 수 없음
}
