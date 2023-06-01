class BOut {
	int i = 1;
	void m1(){
		System.out.println("m1()");
	}
	class BIn1 {
		int j = 2;
		void m2(){
			System.out.println("m2()");
		}
	}
	static class BIn2 {
		int k = 3;
		void m3(){
			System.out.println("m3()");
		}
	}	
}

class B {
	public static void main(String args[]){
		BOut.BIn1 bin1 = new BOut().new BIn1();
		System.out.println("bin1.j: " + bin1.j);
		bin1.m2();

		BOut.BIn2 bin2 = new BOut.BIn2();
		System.out.println("bin2.k: " + bin2.k);
		bin2.m3();
	}
}