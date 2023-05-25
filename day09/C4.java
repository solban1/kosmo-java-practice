import java.io.IOException;
import java.io.InputStreamReader;

public class C4 {
    public static void main(String[] args) {
        try (InputStreamReader r = new InputStreamReader(System.in)) {
            // try resource block
            r.read();
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
