class D4 {
	public static void main(String[] args) {
		int var = 1;
		byte b1 = var;			// error: incompatible types: possible lossy conversion from int to byte
	
		byte num = (int)2;			// OK

		final int constant = 3;
		byte b2 = constant;			// OK
		byte b3 = (int)constant;	// OK

		//System.out.println(b1);
		System.out.println(num);	// 2
		System.out.println(b2);		// 3
		System.out.println(b3);		// 3
	}
}
