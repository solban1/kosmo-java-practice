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
			System.out.println("���� �߻����� ����");
		}catch(MyException me){
			me.doMy();
		}
	}
}
