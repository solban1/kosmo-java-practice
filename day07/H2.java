import java.util.TreeSet;

public class H2 {
    TreeSet<String> ts = new TreeSet<>();

    void in() {
        ts.add("a");
        ts.add("A");
        ts.add("c");
        ts.add("Z");
        ts.add("b");
        ts.add("a");
    }

    void out() {
        ts.iterator().forEachRemaining(s -> System.out.println(s));
    }
    void outR() {
        ts.descendingIterator().forEachRemaining(s -> System.out.println(s));
    }

    public static void main(String[] args) {
        H2 h = new H2();
        h.in();
        h.out();
        h.outR();
    }
}
