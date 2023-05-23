import java.util.ArrayList;

public class J2 {
    static ArrayList<Integer> list = new ArrayList<>();

    private static void m() {
        list.add(1); // autoboxing
        Double d = 1.0; // autoboxing
        System.out.println(d + 1); // unboxing
        System.out.println(list.get(0)); // unboxing
    }

    public static void main(String[] args) {
        m();
    }
}
