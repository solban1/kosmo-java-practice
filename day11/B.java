class B {
	String name; //�ڿ� 
	B(){
		this("�̼���"); //B("�̼���"); //(2)�ڽ��� ������
	}
	B(String name){
		this.name = name; //(1)�ڽ��� ��ü 
		new BUser(this).use(); //(3)�ڽ��� ��ü 
	}
	void m(){ //�ڿ� 
		System.out.println("m()");
	}
	public static void main(String[] args) {
		B b = new B();
		//System.out.println("b.name: " + b.name);
		//b.m();
	}
}

