class A5 {
    int i = 1;
    void m1() {
        int i = 2;
        System.out.println(i);
    }
    void m2() {
        System.out.println(i);
    }
    public static void main(String[] args) {
        A5 a = new A5();
        a.m1();
        a.m2();
    }
}
