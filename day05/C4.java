import java.util.ArrayList;
import java.util.Arrays;

class C4 {
	private static final String[] arr = {"국어", "수학", "영어", "사탐", "과탐"};

	private static void m1() {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void m2() {
		for (String s : arr) {
			System.out.println(s);
		}
	}

	private static void m3() {
		new ArrayList<>(Arrays.asList(arr)).forEach(s -> System.out.println(s));
	}

	public static void main(String[] args) {
		m1();
		m2();
		m3();
	}
}
