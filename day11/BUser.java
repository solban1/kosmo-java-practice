class BUser {
	B b;
	BUser(B b){
		this.b = b;
	}
	void use(){
		b.m(); //���� �ڿ� ȣ�� 
		System.out.println("b.name: " + b.name); //���� �ڿ� ȣ�� 
	}	
}