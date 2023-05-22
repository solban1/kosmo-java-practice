class D5 {
    public static void main(String[] args) {
        char c = 1;
        char b = 2;
        char a = c + b;    // error: incompatible types: possible lossy conversion from int to short
        System.out.println(a);
    }
}
