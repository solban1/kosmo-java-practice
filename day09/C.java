class C {
	void use(){
		B b = new B();
		try{
			System.out.println("1");
			b.m1();
			System.out.println("2");
			b.m3();
			System.out.println("3");
		}catch(MyException me){
			System.out.println("4");
			System.exit(-1);
			//return;
		}catch(YourException ye){
			System.out.println("5");
		}finally{
			System.out.println("6");
		}

		System.out.println("7");
	}
	public static void main(String[] args) {
		C c = new C();
		c.use();
		System.out.println("main³¡");
	}
}
