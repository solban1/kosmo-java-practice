public class C {
    private static void m2() {
        int i = 1;
        switch (i) {
            case 0:
                System.out.println("0");
                break;

            case 1:
                System.out.println("1");
                break;

            default:
                System.out.println("Other");
                break;
        }
    }

    public static void main(String[] args) {
        m2();
    }
}
