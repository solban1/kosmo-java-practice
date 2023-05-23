public class A2 {
    static String[] s;

    public static void main(String[] args) {
        s = new String[2];
        s[0] = "a";
        System.out.println(s);      // [Ljava.lang.String;@24d46ca6
        System.out.println(s[0]);   // a
        System.out.println(s[1]);   // null

    }
}