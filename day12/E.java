class E {
	void m(){
		System.out.println("E¿« m()");
	}
}
class EChild extends E {
	@Override 
	void m(){
		System.out.println("EChild¿« m()");
	}
}
class EUser{
	public static void main(String args[]){
		EChild child = new EChild();
		child.m();
	}
}
