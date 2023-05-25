import java.io.IOException;
import java.io.InputStreamReader;

public class C3 {
    
    public static void main(String[] args) {
        InputStreamReader r = new InputStreamReader(System.in);
        try {
            r.read();
        } catch (IOException e) {
            System.out.println(e);
            return;
        } finally {
            System.out.println("cleanup?");
        }

        // some other code
        System.out.println("test");
    }
}