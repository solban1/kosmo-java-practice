class B2R implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}

public class B2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(new B2R()).start();
        }
    }
}
