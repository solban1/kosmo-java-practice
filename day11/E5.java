class E5 {
    E5() {}
    E5(int i) {}
    E5(String s) {}
    E5(int i, String s) {}

    void m() {}
    int m(int i) {return i;}
    String m(String s, int i) {return s;}
}

class E5Child extends E5 {
    void m(String s) {}
}

class E5User {
    public static void main(String[] args) {
        E5Child e = new E5Child();

        byte b = 1;
        int r1 = e.m(b);
        System.out.println("r1: " + r1);

        int i = 2;
        int r2 = e.m(i);
        System.out.println("r2: " + r2);
    }
}
