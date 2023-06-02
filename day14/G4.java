interface G4I {
    void m();
}

public class G4 {
    int i = 0;
    void use(int j) {
        int k = 2;

        G4I gi = () -> {
            System.out.println("i: " + i);
            System.out.println("j: " + j);
            System.out.println("k: " + k);
        };

        gi.m();
    }

    public static void main(String[] args) {
        G4 g = new G4();
        g.use(1);
    }
}
