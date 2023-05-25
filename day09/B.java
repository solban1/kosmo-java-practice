class B 
{
	int i = 1;
	void m1() throws YourException {
		if(i==0) throw new YourException();
	}
	void m2() throws Exception {
		if(i<0) throw new Exception();
	}
	void m3() throws MyException {
		if(i>0) throw new MyException();
	}
	public static void main(String[] args) 
		throws MyException, YourException, Exception {
		B b = new B();
		b.m1();
		b.m2();
		b.m3();

		/*try{
			b.m1();
			b.m2();
			b.m3();
		}catch(YourException ye){
			ye.doYour();
		}catch(MyException me){
			me.doMy();
		}catch(Exception e){
			System.out.println(e);
		}*/

		/*
		try{
			b.m1();
		}catch(YourException ye){
			ye.doYour();
		}
		try{
			b.m2();
		}catch(Exception e){
			System.out.println(e);
		}
		try{
			b.m3();
		}catch(MyException me){
			me.doMy();
		}
		*/
	}
}
