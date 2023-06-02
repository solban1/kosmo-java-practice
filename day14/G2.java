interface G2I {
    void m();
}

public class G2 {
    int fld = 0;
    void mthd(int par) {
        int loc = 2;
        new G2I() {
            public void m() {
                System.out.printf("%d %d %d\n", fld, par, loc);
            }
        }.m();
    }
    public static void main(String[] args) {
        new G2().mthd(1);
    }    
}