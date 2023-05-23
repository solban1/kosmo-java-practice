import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class I3 {
    private static void m() {
        HashMap<Integer, String> hm = new HashMap<>();

        for (int i = 100; i > -100; i--) {
            hm.put(i, Integer.toString(i));
        }

        System.out.println(hm.keySet().getClass()); // class java.util.HashMap$KeySet
        for (int k : hm.keySet()) {
            System.out.println(k + ", " + hm.get(k)); // 0, -1, 1, -2, 2, ...
        }

        TreeSet<Integer> newSet = new TreeSet<>(hm.keySet());
        for (int k : newSet) {
            System.out.println(k + ", " + hm.get(k)); // -99, -98, -97, ...
        }
    }

    public static void main(String[] args) {
        m();
    }
}
