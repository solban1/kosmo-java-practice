class D3Th extends Thread {
    D3Th() {
        start();
    }

    public void run() {
        m();
    }

    synchronized void m() { // 안됨. 아마 객체별로 각각 생성되는 메서드라 그런듯
        for(int j = 0; j < 10000; j++) {
            D3.i++;
        }
    }
}

public class D3 {
    static int i = 0;
    public static void main(String[] args) {
        for(int k = 0; k < 100; k++) {
            new D3Th();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(i);
    }
}
