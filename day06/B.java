class B {
	void m1(){
		for(int i=0; i<5; i++){
			if(i==2) continue;
			System.out.println("i: " + i);
		}
		System.out.println("loop¹Û");
	}
	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}
}
