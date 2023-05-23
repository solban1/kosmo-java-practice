import java.util.HashMap;
import java.util.HashSet;

public class I2 {
    private static void m() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(5, "a");
        hm.put(4, "b");
        hm.put(3, "c");
        hm.put(2, "d");
        hm.put(1, "e");
        hm.put(0, "f");

        System.out.println(hm.keySet().getClass()); // java.util.HashMap$KeySet
        for (int k : hm.keySet()) {
            System.out.println(k + ", " + hm.get(k));
        }

        HashSet<Integer> newSet = new HashSet<>(hm.keySet());
        for (int k : newSet) {
            System.out.println(k + ", " + hm.get(k));
        }
    }

    public static void main(String[] args) {
        m();
    }
}
