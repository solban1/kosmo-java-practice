class B {
	String name; //자원 
	B(){
		this("이순신"); //B("이순신"); //(2)자신의 생성자
	}
	B(String name){
		this.name = name; //(1)자신의 객체 
		new BUser(this).use(); //(3)자신의 객체 
	}
	void m(){ //자원 
		System.out.println("m()");
	}
	public static void main(String[] args) {
		B b = new B();
		//System.out.println("b.name: " + b.name);
		//b.m();
	}
}

