import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class Lotto {
	BufferedReader br;
	String filename;

	Lotto() {
		this.filename = "우리반.txt";
		openFile(this.filename);
	}
	Lotto(String filename) {
		this.filename = filename;
		openFile(this.filename);
	}

	/**
	 * 파일 열기
	 * @param filename 파일명
	 */
	private void openFile(String filename) {
		try {
			br = new BufferedReader(new FileReader(filename, Charset.forName("UTF-8")));
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * 파일의 N번째 줄 출력
	 * @param line 출력할 줄 번호(0이 첫번째 줄)
	 */
	private void printLine(int line) {
		try {
			for (int i = 0; i < line; i++) {
				br.readLine();
			}
			System.out.println("당첨자: " + br.readLine());
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	/**
	 * 학생 수를 하드코딩하여 추첨
	 */
	void pick1() {
		final int lineCount = 18;
		final int line = new Random().nextInt(lineCount);

		printLine(line);
	}

	/**
	 * 텍스트 파일의 줄 수를 통해 학생 수를 구하고 추첨
	 */
	void pick2() {
		int lineCount = 0;
		try {
			for (lineCount = 0; br.readLine() != null; lineCount++);
		} catch (IOException e) {
			System.out.println(e);
		}

		final int line = new Random().nextInt(lineCount);
		openFile(this.filename);
		printLine(line);
	}

	/**
	 * 학생 이름이 담긴 ArrayList를 만들고 순서를 섞어서 추첨
	 * @param count 추첨할 학생 수
	 */
	void pick3(int count) {
		ArrayList<String> arr = new ArrayList<>(br.lines().toList());
		Collections.shuffle(arr);

		arr.subList(0, Math.min(arr.size(), count)).forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {
		final int count = args.length >= 1 ? Integer.parseInt(args[0]) : 1;
		new Lotto().pick1();
		new Lotto().pick2();
		new Lotto().pick3(count);
	}
}