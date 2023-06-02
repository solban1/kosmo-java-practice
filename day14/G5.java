interface G5I {
    void m();
}

public class G5 {
    int i = 0;
    void use(int j) {
        int k = 2;

        G5I gi = () -> {
            System.out.println(i);
            System.out.println(j);
            System.out.println(k);
        };

        gi.m();
    }

    public static void main(String[] args) {
        G5 g = new G5();
        g.use(1);
    }
}
