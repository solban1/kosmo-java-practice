class A {
	void m1(){
		for(int i=0; i<5; i++){
			if(i==3) break;
			System.out.println("i: " + i);
		}
		System.out.println("loop¹Û");
	}
	void m2(){
		aa:
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				if(j==1) break aa;
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("loop¹Û(1)");
		}
		System.out.println("loop¹Û(2)");
	}
	void m3(){
		String lunch = "Â¥Àå¸é";
		char c = 'B';
		switch(lunch){
			case "Â«»Í": System.out.println("Â«»Í"); break;
			case "Â¥Àå¸é": System.out.println("Â¥Àå¸é"); 
				switch(c){
					case 'A': System.out.println("A"); break;
					case 'B': System.out.println("B"); break;
					default: System.out.println("Aµµ Bµµ ¾Æ´Ô"); 
				} 
				System.out.println("switch¹Û(1)");
				break;
			default : System.out.println("±× ¿Ü"); 
		}
		System.out.println("switch¹Û(2)");
	}
	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
