class E4 {
    E4() {}
    E4(int i) {}
    E4(int i, String s) {}
    E4(String s, int i) {}

    void m() {}
    int m(int i) {return i;}
    String m(String s, int i) {return s;}
}

class E4Child extends E4 {
    void m(String s) {}
}

class E4User {
    public static void main(String[] args) {
        E4Child e = new E4Child();

        byte b = 1;
        int r1 = e.m(b);
        System.out.println("r1: " + r1);

        int i = 2;
        int r2 = e.m(i);
        System.out.println("r2: " + r2);
    }
}
