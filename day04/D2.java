class D2 {
    byte b = Byte.MAX_VALUE;
    int i = Integer.MAX_VALUE;
    char c = Character.MAX_VALUE;
    float f = Float.MAX_VALUE;
    double d = Double.MAX_VALUE;

    void m1() {
        //byte r = (byte)(b + 1);
        int r = b + i;
        System.out.println(r);;
    }

    void m2() {
        System.out.println((int)c);
    }

    void m3() {
        double r = f + d;
        System.out.println(r);
    }

    public static void main(String[] args) {
        D2 d = new D2();
        d.m1();
        d.m2();
        d.m3();
    }
}
