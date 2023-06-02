interface G3I {
    void m();
}

public class G3 {
    int i = 0;
    void use(int j) {
        int k = 2;

        G3I gi = () -> {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
            System.out.println("k: " + k);
        };

        gi.m();
    }
    public static void main(String[] args) {
        new G().use(1);
    }
}
