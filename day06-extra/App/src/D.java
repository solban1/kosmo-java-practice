public class D {
    private static void m1() {
        int i = 0;
        while (i < 5) {
            System.out.println("i: " + i);
            i++;
        }
    }

    private static void m2() {
        int i = 0;
        do {
            System.out.println("i: " + i);
            i++;
        } while (i < 5);
    }

    private static void m3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("i: " + i);
        }
    }

    public static void main(String[] args) {
        // m1();
        m2();
    }
}
