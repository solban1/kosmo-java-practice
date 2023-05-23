public class E2 {
    private static void m() {
        int[][] iss = {{1, 2, 3}, {3, 4}};

        System.out.println(iss);        // [[I@24d46ca6
        System.out.println(iss[1]);     // [I@4517d9a3
        System.out.println(iss[0][2]);  // 4
    }
    
    public static void main(String[] args) {
        m();
    }
}
