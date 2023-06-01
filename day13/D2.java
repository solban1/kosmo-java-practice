class D2Th extends Thread {
    public void run() {
        D2.m();
    }
}

public class D2 {
    static int i;
    
    synchronized static void m() {
        for(int j = 0; j < 10000; j++) {
            i++;
        }
    }

    public static void main(String[] args) {
        D2Th th1 = new D2Th();
        D2Th th2 = new D2Th();
        th1.start();
        th2.start();

        try {
            th1.join();
            th2.join();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        System.out.println(i);
    }
}
