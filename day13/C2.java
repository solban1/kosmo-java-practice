class C2Th extends Thread {
    C2Th() {
        System.out.println("priority: " + getPriority());
    }

    public void run() {

    }
}

public class C2 {
    public static void main(String[] args) {
        new C2Th();
    }
}
