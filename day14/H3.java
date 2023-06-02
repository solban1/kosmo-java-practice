class H3R implements Runnable {
    public void run() {
        while (true) {
            System.out.println("thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class H3 {
    void use1() {
        new Thread(new H3R()).start();
    }
    void use2() {
        Runnable r = new Runnable() {
            public void run() {
                while(true) {
                    System.out.println("thread");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        };
        new Thread(r).start();
    }
    void use3() {
        Runnable r = () -> {
            while(true) {
                System.out.println("thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        };
        new Thread(r).start();
    }
    void use4() {
        Runnable r = () -> work();
        new Thread(r).start();
    }
    void work() {
        while(true) {
            System.out.println("thread");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    void use5() {
        new Thread(() -> work()).start();
    }

    public static void main(String[] args) {
        new H3().use5();
    }
}
