class A3Th extends Thread {
    public void run() {
        System.out.println(getId());
    }
}

public class A3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new A3Th().start();
        }
    }
}
