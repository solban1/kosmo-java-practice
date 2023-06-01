import java.util.ArrayList;
import java.util.List;

abstract class F4A1 {
    abstract void m();
}

public class F4 {
    public static void main(String[] args) {
        F4A1 a = new F4A1() {
            public void m() {
                System.out.println("m()");
            }
        };
        a.m();

        ArrayList<Integer> arr1 = new ArrayList<>(List.of(1, 2, 3));
        System.out.println(arr1.toString()); 

        ArrayList<Integer> arr2 = new ArrayList<>(List.of(1, 2, 3)) {
            public String toString() {
                String s = getClass().getEnclosingClass().getName() +  ": [";
                for (var e : this) {
                    s += e + ", ";
                }
                s = s.substring(0, s.length() - 2);
                return s + "]";
            };
        };
        System.out.println(arr2);
    }
}
