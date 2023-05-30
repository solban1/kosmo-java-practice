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
		super("������"); //(2)�θ��� ������ 
	}
	void m(){ //Overriding 
		System.out.println("CChild m()");
	}
	void show(){
		System.out.println("age: " + age);
		System.out.println("age: " + super.age); //(1)�θ��� ��ü 
		System.out.println("name: " + name);
		m();
		super.m(); //(3)�θ��� ��ü 
	}
}

class CUser {
	public static void main(String[] args) {
		new CChild().show();
	}
}
