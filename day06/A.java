class A {
	void m1(){
		for(int i=0; i<5; i++){
			if(i==3) break;
			System.out.println("i: " + i);
		}
		System.out.println("loop��");
	}
	void m2(){
		aa:
		for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				if(j==1) break aa;
				System.out.println("i: " + i + ", j: " + j);
			}
			System.out.println("loop��(1)");
		}
		System.out.println("loop��(2)");
	}
	void m3(){
		String lunch = "¥���";
		char c = 'B';
		switch(lunch){
			case "«��": System.out.println("«��"); break;
			case "¥���": System.out.println("¥���"); 
				switch(c){
					case 'A': System.out.println("A"); break;
					case 'B': System.out.println("B"); break;
					default: System.out.println("A�� B�� �ƴ�"); 
				} 
				System.out.println("switch��(1)");
				break;
			default : System.out.println("�� ��"); 
		}
		System.out.println("switch��(2)");
	}
	public static void main(String[] args) {
		A a = new A();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
