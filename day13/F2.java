import java.util.function.Consumer;

public class F2 {
    public static void main(String[] args) {
        Consumer<String> i = (s) -> { System.out.println(s); };
        i.accept("abc");
    }
}
