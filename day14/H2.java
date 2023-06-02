public class H2 {
    static void work(int i) {
        for (int j = 0; j < 5; j++) {
            System.out.println("thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        };
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            final int CI = i;
            new Thread(() -> work(CI)).start();
        }
    }
}
