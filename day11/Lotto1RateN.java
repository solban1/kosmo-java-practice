import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

class RandomBox {
    private ArrayList<String> entries;
    private ArrayList<String> chosen;
    private ArrayList<Double> chooseRate;
    private Random r;

    public RandomBox(String filename) throws IOException, NumberFormatException {
        r = new Random();
        final BufferedReader fileBr = new BufferedReader(new FileReader(filename, Charset.forName("UTF-8")));

        entries = new ArrayList<>();
        chosen = new ArrayList<>();
        chooseRate = new ArrayList<>();
        double rateSum = 0.0;
        while (true) {
            String line = fileBr.readLine();
            if (line == null) {
                break;
            }

            line = line.strip();
            if (line != "") {
                final int spaceIndex = line.indexOf(" ");
                if (spaceIndex != -1) { // 확률이 적혀 있는 경우, entries에 추가하지 않고 chosen에 이름, chooseRate에 확률 *누적값*을 각각 추가
                    chosen.add(line.substring(0, spaceIndex).stripTrailing());
                    rateSum += Math.max(0, Double.parseDouble(line.substring(spaceIndex).stripLeading()) / 100);
                    if (rateSum > 1.0) {
                        System.out.println("확률의 합이 100을 초과합니다.");
                        System.exit(-1);
                    }
                    chooseRate.add(rateSum);
                } else { // 확률이 적혀 있지 않은 경우
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
        String winner = null;
        final double rate = r.nextDouble();
        //System.out.println("r: " + rate);

        for (int i = 0; i < chosen.size(); i++) { // 확률이 적힌 인원 중 추첨
            if (rate < chooseRate.get(i)) {
                winner = chosen.get(i);
                break;
            }
        }

        if (winner == null) { // 나머지 인원 중 추첨
            winner = entries.get(r.nextInt(getSize()));
        }

        System.out.println("당첨자: " + winner);
    }
}

public class Lotto1RateN {
    private static final String FILENAME = "list.txt";

    public static void main(String[] args) {
        if (!(new File(FILENAME).exists())) {
            System.out.println(FILENAME + " 파일을 찾을 수 없습니다.");
            return;
        }

        RandomBox box;
        try {
            box = new RandomBox(FILENAME);
        } catch (NumberFormatException e) {
            System.out.println(FILENAME + " 파일에 숫자가 아닌 확률값이 들어 있습니다.");
            return;
        } catch (IOException e) {
            System.err.println(FILENAME + " 파일을 읽는 중 오류: " + e);
            return;
        }

        box.pick();
    }
}
