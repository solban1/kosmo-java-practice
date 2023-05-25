import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

class RandomBox {
    private HashMap<Integer, String> entries;
    private Random r;

    RandomBox(String filename) throws IOException {
        r = new Random();
        BufferedReader fileBr = new BufferedReader(new FileReader(filename, Charset.forName("UTF-8")));

        entries = new HashMap<>();
        int number = 0;
        while (true) { // strip 후 공백이 아닌 항목을 entries에 추가
            String line = fileBr.readLine();
            if (line == null) {
                break;
            }

            line = line.strip();
            if (line != "") {
                entries.put(number++, line);
            }
        }

        fileBr.close();
    }

    /**
     * {@code key}값에 해당하는 사람의 정보를 리턴
     * 
     * @param key {@code entries}에 해당하는 키값
     * @return 해당하는 사람의 정보(번호, 이름)
     */
    private String getInfo(int key) {
        return "번호: %02d, 이름: %s".formatted(key, entries.get(key));
    }

    public class EntryIndexOutOfBoundsException extends IndexOutOfBoundsException {
        EntryIndexOutOfBoundsException(int index) {
            super(index);
        }
    }

    /**
     * 사람 수를 반환
     * @return {@code entries}의 크기
     */
    public int getSize() {
        return entries.size();
    }

    /**
     * TreeMap을 활용하여 추첨
     * 
     * @param count 추첨할 사람 수
     */
    public void pick(int count) throws EntryIndexOutOfBoundsException {
        if (count > getSize() || count < 1) {
            throw new EntryIndexOutOfBoundsException(count);
        }
        
        TreeSet<Integer> winnerIndices = new TreeSet<>();
        while (winnerIndices.size() < count) {
            winnerIndices.add(r.nextInt(getSize()));
        }

        Iterator<Integer> winnerIndexIterator = winnerIndices.iterator();
        while(winnerIndexIterator.hasNext()) {
            System.out.println(getInfo(winnerIndexIterator.next()));
        }
    }
}

public class LottoMulti {
    private static String getUserInput() {
        try {
            return new BufferedReader(new InputStreamReader(System.in)).readLine().strip();
        } catch (IOException e) {
            System.err.println(e);
            return "";
        } catch (NullPointerException e) {
            System.err.println();
            System.err.println("KeyboardInterrupt");
            System.exit(2);
            return "";
        }
    }

    private static String getFilename() throws InvalidPathException, FileNotFoundException {
        String filename = getUserInput();

        if (filename == "") {
            filename = "우리반리스트.txt";
        }

        // throws InvalidPathException
        Path.of(filename);

        if (!(new File(filename).isFile())) {
            throw new FileNotFoundException();
        }

        return filename;
    }

    public static void main(String[] args) {
        String filename;
        RandomBox box;
        while (true) {
            System.out.print("파일명(공백 입력시 \"우리반리스트.txt\"): ");
            try {
                filename = getFilename();
                box = new RandomBox(filename);
            } catch (InvalidPathException e) {
                System.out.println("올바르지 않은 경로 형식입니다.");
                continue;
            } catch (FileNotFoundException e) {
                System.out.println("파일을 찾을 수 없습니다.");
                continue;
            } catch (IOException e) {
                System.err.println("파일을 읽는 중 오류: " + e);
                return;
            }
            break;
        }

        while(true) {
            System.out.print("당첨자 수(최대 " + box.getSize() + "): ");
            try {
                box.pick(Integer.parseInt(getUserInput()));
            } catch (NumberFormatException e) {
                System.out.println("숫자를 입력하세요.");
                continue;
            } catch (RandomBox.EntryIndexOutOfBoundsException e) {
                System.out.println("1부터 " + box.getSize() + "까지의 숫자를 입력해주세요.");
                continue;
            }
            break;
        }
    }
}
