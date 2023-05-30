package aa.bb;

class A {
	private String name = "홍길동";
	A(){
		System.out.println("A()");
	}
	private void m(){
		System.out.println("m()");
	}
	void useSelf(){
		new A(); //생성자 사용  
		System.out.println("name: " + name); //멤버 사용 
		m(); //메소드 사용 
	}
}
