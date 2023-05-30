public class E2 {
    E2() {}
    E2(int i) {} // constructor overloading

    void m() {}
    void m(int i) {} // method overloading
    //int m(int i) {return i;} // not OK
    int m(int i, String s) {return i;} // overloading

    public static void main(String[] args) {
        
    }
}

class E2Child extends E2 {
    void m(int i, int j) {} // overloading
}