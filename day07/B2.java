public class B2 {
    String[] strs = {"Spring", "Summer", "Autumn", "Winter"};
    String[] strs2;

    void in() {
        //strs2 = {"a", "b"};   // error: illegal start of expression
        strs2 = new String[]({"a", "b"})
    }

    public static void main(String[] args) {
        System.out.println(new B2().strs[3]);
    }
}
