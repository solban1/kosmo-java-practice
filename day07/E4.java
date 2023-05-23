public class E4 {
    private static void m() {
        int[][][][][][][][][][] issssssssss = new int[2][][][][][][][][][];
        issssssssss[0] = new int[2][][][][][][][][];
        issssssssss[0][0] = new int[2][][][][][][][];
        issssssssss[0][0][0] = new int[2][][][][][][];
        issssssssss[0][0][0][0] = new int[2][][][][][];
        issssssssss[0][0][0][0][0] = new int[2][][][][];
        issssssssss[0][0][0][0][0][0] = new int[2][][][];
        issssssssss[0][0][0][0][0][0][0] = new int[2][][];
        issssssssss[0][0][0][0][0][0][0][0] = new int[2][];
        issssssssss[0][0][0][0][0][0][0][0][0] = new int[2];
        issssssssss[0][0][0][0][0][0][0][0][0][0] = 1;

        System.out.println(issssssssss);                                // [[[[[[[[[[I@24d46ca6
        System.out.println(issssssssss[0][0][0][0][0][0][0][0][0][0]);  // 1
    }

    public static void main(String[] args) {
        m();
    }
}
