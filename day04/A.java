class A {
	int i = 1;
	void m1(){
		int j = 2; 
		System.out.println("j: " + j);
	}
	void m2(){
		System.out.println("i: " + i);
		//System.out.println("j: " + j);
	}
	public static void main(String[] args){
		A a = new A();
		a.m1();
		a.m2();
	}
}
