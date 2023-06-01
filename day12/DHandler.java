class DHandler {
	DOut out;
	DHandler(DOut out){
		this.out = out;
	}
	void use(){
		System.out.println("out.i: " + out.getI());	
		out.m();
	}
}
