import java.util.Random;
import java.util.TreeSet;

public class H4 {
    /**
     * 로또 번호 생성기
     */
    private static void printLottoNumbers() {
        TreeSet<Integer> ts = new TreeSet<>();
        Random r = new Random();
        while (ts.size() < 6) {
            ts.add(r.nextInt(1, 46));
        }
        for (int number : ts) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printLottoNumbers();
    }
}
