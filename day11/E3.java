public class E3 {
    public static void main(String[] args) {
        byte b = 1;
        new E3C1().m(b); // byte 1
        new E3C2().m(b); // int 1
        new E3C3().m(b); // long 1
        // 파라미터 타입이 같은 메서드 우선, 같은 타입이 없을 경우 자동형변환 가능한 타입의 메서드 호출(가까운 형변환 우선)
    }
}

class E3C1 {
    void m(long lo) {
        System.out.println("long " + lo);
    }
    void m(int i) {
        System.out.println("int " + i);
    }
    void m(byte b) {
        System.out.println("byte " + b);
    }
}

class E3C2 {
    void m(long lo) {
        System.out.println("long " + lo);
    }
    void m(int i) {
        System.out.println("int " + i);
    }
}

class E3C3 {
    void m(long lo) {
        System.out.println("long " + lo);
    }
}
