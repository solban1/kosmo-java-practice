import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.List;
import java.util.Random;

class RandomBox {
    ArrayList<String> entries;
    Random r;

    // RandomBox(String filename) throws IOException {

    // BufferedReader fileBr = new BufferedReader(new FileReader(filename,
    // Charset.forName("UTF-8")));
    // List<String> lines = fileBr.lines().toList();
    // fileBr.close();

    // //List<String> lines = Files.readAllLines(Path.of(filename),
    // Charset.forName("UTF-8"));

    // entries = new ArrayList<>();
    // for (String line : lines) { // strip 후 공백이 들어간 element 제거 후 entries에 추가
    // line = line.strip();
    // if (line != "") {
    // entries.add(line);
    // }
    // }

    // }

    RandomBox(String filename) throws IOException {
        r = new Random();
        BufferedReader fileBr = new BufferedReader(new FileReader(filename, Charset.forName("UTF-8")));

        entries = new ArrayList<>();
        while (true) { // strip 후 공백이 아닌 항목을 entries에 추가
            String line = fileBr.readLine();
            if (line == null) {
                break;
            }

            line = line.strip();
            if (line != "") {
                entries.add(line);
            }
        }

        fileBr.close();
    }

    /**
     * 학생 이름이 담긴 ArrayList의 순서를 섞어서 추첨
     * 
     * @param count 추첨할 학생 수
     */
    void pick(int count) {
        Collections.shuffle(entries);

        for (String winner : entries.subList(0, Math.min(entries.size(), count))) {
            System.out.println("당첨자: " + winner);
        }
    }

    /**
     * Random.nextInt()를 활용하여 1명 추첨
     */
    void pick() {
        System.out.println("당첨자: " + entries.get(r.nextInt(entries.size())));
    }
}

public class LottoC {
    private static String getFilename() throws InvalidPathException, FileNotFoundException {
        BufferedReader inputBr = new BufferedReader(new InputStreamReader(System.in));
        String filename;

        try {
            filename = inputBr.readLine().strip();
        } catch (IOException e) {
            System.err.println(e);
            return "";
        }

        if (filename == "") {
            return "우리반.txt";
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
            System.out.print("파일명: ");
            try {
                filename = getFilename();
            } catch (InvalidPathException e) {
                System.out.println("올바르지 않은 경로 형식입니다.");
                continue;
            } catch (FileNotFoundException e) {
                System.out.println("파일을 찾을 수 없습니다.");
                continue;
            }

            try {
                box = new RandomBox(filename);
            } catch (IOException e) {
                System.err.println("파일을 읽는 중 오류: " + e);
                return;
            }
            break;
        }

        if (args.length >= 1) {
            box.pick(Integer.parseInt(args[0]));
        } else {
            box.pick();
        }
    }
}
