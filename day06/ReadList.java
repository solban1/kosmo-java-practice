import java.io.*;
import java.nio.charset.Charset;

class ReadList {
	BufferedReader br;

	ReadList() {
		try { 
			br = new BufferedReader(new FileReader("우리반.txt", Charset.forName("UTF-8")));
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
	}

	void show() {
		try {
			String line = "";
			int i;
			for (i = 0; (line=br.readLine()) != null; i++) {
				System.out.println(i + ": " + line);
			}
			System.out.println("----------");
			System.out.println("총인원: " + i);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
