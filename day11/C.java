class C {
	int age = 10;
	String name;
	C(String name){
		this.name = name;
	}
	void m(){
		System.out.println("C m()");
	}
}
class CChild extends C {
	int age = 20;
	CChild(){
		super("강감찬"); //(2)부모의 생성자 
	}
	void m(){ //Overriding 
		System.out.println("CChild m()");
	}
	void show(){
		System.out.println("age: " + age);
		System.out.println("age: " + super.age); //(1)부모의 객체 
		System.out.println("name: " + name);
		m();
		super.m(); //(3)부모의 객체 
	}
}

class CUser {
	public static void main(String[] args) {
		new CChild().show();
	}
}
