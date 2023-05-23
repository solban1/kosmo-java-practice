import java.util.HashSet;

public class H3 {
    HashSet<String> hs = new HashSet<>();

    void in() {
        hs.add("a");
        hs.add("A");
        hs.add("c");
        hs.add("Z");
        hs.add("b");
        hs.add("a");
    }

    void out() {
        hs.iterator().forEachRemaining(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        H3 h = new H3();
        h.in();
        h.out();
    }
}
