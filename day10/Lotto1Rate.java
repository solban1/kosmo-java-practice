import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

class RandomBox {
    private ArrayList<String> entries;
    private String chosen;
    private double chooseRate;
    private Random r;

    public RandomBox(String filename) throws IOException {
        r = new Random();
        final BufferedReader fileBr = new BufferedReader(new FileReader(filename, Charset.forName("UTF-8")));

        entries = new ArrayList<>();
        while (true) {
            String line = fileBr.readLine();
            if (line == null) {
                break;
            }

            line = line.strip();
            if (line != "") {
                final int spaceIndex = line.indexOf(" ");
                if (spaceIndex != -1) { // 확률이 적혀 있는 경우, entries에 추가하지 않고 chosen, chooseRate 설정
                    chosen = line.substring(0, spaceIndex).stripTrailing();
                    chooseRate = Double.parseDouble(line.substring(spaceIndex).stripLeading()) / 100;
                } else {
                    entries.add(line);
                }
            }
        }

        fileBr.close();
    }

    /**
     * 사람 수를 반환
     * 
     * @return {@code entries}의 크기
     */
    public int getSize() {
        return entries.size();
    }

    /**
     * 특정 확률 대상자를 먼저 확률에 따라 당첨여부 결정, 낙첨 시 나머지 대상자 풀에서 추첨
     */
    public void pick() {
        String winner;
        if (r.nextDouble() < chooseRate) {
            winner = chosen;
        } else {
            winner = entries.get(r.nextInt(getSize()));
        }

        System.out.println("당첨자: " + winner);
    }
}

public class Lotto1Rate {
    private static final String FILENAME = "list.txt";

    public static void main(String[] args) {
        if (!(new File(FILENAME).isFile())) {
            System.out.println(FILENAME + " 파일을 찾을 수 없습니다.");
            return;
        }

        RandomBox box;
        try {
            box = new RandomBox(FILENAME);
        } catch (IOException e) {
            System.err.println("파일을 읽는 중 오류: " + e);
            return;
        }

        box.pick();
    }
}
