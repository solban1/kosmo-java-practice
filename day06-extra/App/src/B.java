public class B {
	private static void m1() {
		int var = 1;
		//byte b1 = var;			// error: incompatible types: possible lossy conversion from int to byte
		byte b1 = 1;

		int num = (int)2;			// OK

		final int constant = 3;
		byte b2 = constant;			// OK
		byte b3 = (int)constant;	// OK
		byte b4 = (int)4;			// OK

		final int bigConstant = 1000;
		//byte b5 = bigConstant;	// error: incompatible types: possible lossy conversion from int to byte

		//System.out.println(b1);
		System.out.println(num);	// 2
		System.out.println(b2);		// 3
		System.out.println(b3);		// 3
		System.out.println(b4);		// 4
	}

	public static void main(String[] args) {
		m1();
	}
}
