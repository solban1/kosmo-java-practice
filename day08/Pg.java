import java.util.ArrayList;
import java.util.List;

public class Pg {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>(List.of("a", "a"));
        for (String s : a) {
            System.out.println(s);
            s = new String("b");
        }
        for (String s : a) {
            System.out.println(s);
        }
    }
}
