class BUser {
	B b;
	BUser(B b){
		this.b = b;
	}
	void use(){
		b.m(); //남의 자원 호출 
		System.out.println("b.name: " + b.name); //남의 자원 호출 
	}	
}