import java.util.function.Function;

public class F3 {
    public static void main(String[] args) {
        Function<Integer, Integer> ff = i -> i + 100;
        System.out.println(ff.apply(2));
    }
}
