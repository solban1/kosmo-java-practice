import java.util.ArrayList;

public class G2 {
    ArrayList<String> a = new ArrayList<>();

    void in() {
        a.add("봄");
        a.add("여름");
        a.add("가을");
        a.add("겨울");
        a.remove(a.size() - 1);
    }
    void out() {
        int size = a.size();
        for (int i = 0; i < size; i++) {
            System.out.println(i + ": " + a.get(i));
        }
    }

    public static void main(String[] args) {
        G2 g2 = new G2();
        g2.in();
        g2.out();
    }
}
