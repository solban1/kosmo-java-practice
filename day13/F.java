interface FI1 {
	void m1();
}
/*class FI1Child implements FI1{
	public void m1(){
		System.out.println("m1() 备泅1");
	}
}*/
interface FI2 {
	void m2(int i);
}
interface FI3 {
	int m3(int i, int j);
}

class F {
	void use1(){
		//FI1 fi1 = new FI1Child();
		/*FI1 fi1 = new FI1(){
			public void m1(){
				System.out.println("m1() 备泅2");
			}
		};*/
		FI1 fi1 = () -> { System.out.println("m1() 备泅3"); };

		fi1.m1();
	}
	void use2(){
		FI2 fi2 = (i) -> {
			int r = i + 1;
			System.out.println("m2() 备泅4 r: " + r);
		};

		fi2.m2(1);
	}
	void use3(){
		//FI3 fi3 = (i, j) -> { return i+j; };
		FI3 fi3 = (i, j) -> i+j;

		int sum = fi3.m3(10, 20);
		System.out.println("sum: " + sum);
	}
	void use4(){
		FI3 fi3 = (i, j) -> multiply(i, j);
		int mul = fi3.m3(10, 20);
		System.out.println("mul: " + mul);
	}
	int multiply(int i, int j){
		return i*j;
	}
	public static void main(String[] args) {
		F f = new F();
		//f.use1();
		//f.use2();
		//f.use3();
		f.use4();
	}
}
