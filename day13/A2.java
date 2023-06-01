class A2Th extends Thread {
    void m() {
        start(); // 
        for (int i = 0; i < 100; i++) {
            System.out.println("main");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("thread");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class A2 {
    public static void main(String[] args) {
        new A2Th().m();
    }
}
