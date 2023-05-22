class A4 {
    int i;
    void m1() {
        int j;
        System.out.println(i);
        //System.out.println(j); // error: variable j might not have been initialized
    }
    public static void main(String[] args) {
        new A4().m1();
    }
}
