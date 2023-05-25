import java.util.Set;
import java.util.TreeSet;

public class Pg2 {
    public static void main(String[] args) {
        TreeSet<Integer> s = new TreeSet<>(Set.of(0, 1, 2, 3));
        s.iterator().forEachRemaining(e -> System.out.println(e));;
    }
}
