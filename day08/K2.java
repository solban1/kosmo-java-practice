import java.util.ArrayList;
import java.util.List;

public class K2 {
    private static void m() {
        ArrayList<String> a1 = new ArrayList<>(List.of("봄", "여름", "가을", "겨울"));
        ArrayList<String> a2 = new ArrayList<>(List.of("여행", "선물", "쇼핑", "외식"));
        ArrayList<ArrayList<String>> aa = new ArrayList<>(List.of(a1, a2));

        aa.add(a1);
        aa.add(a2);

        for (ArrayList<String> a : aa) {
            for (String s : a) {
                System.out.println(s);
            }
        }

    }

    public static void main(String[] args) {
        m();
    }
}