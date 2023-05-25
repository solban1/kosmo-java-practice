class A {
	boolean flag;
	A() throws MyException {
		if(!flag){
			throw new MyException();
		}
	}
	public static void main(String[] args) {//throws MyException {
		try{
			new A();
			System.out.println("예외 발생하지 않음");
		}catch(MyException me){
			me.doMy();
		}
	}
}
