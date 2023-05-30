class E {
	E(){} //생성자 오버로딩 
	E(int i){}
	E(String s){}
	E(int i, String s){}

	void m(){} //메소드 오버로딩 
	int m(int i){ return i; }
	String m(String s, int i){ return s; }
	//byte m(byte b){ return b; } //오버로딩
}
class EChild extends E{
	void m(String s){} //오버로딩 
}

class EUser{
	public static void main(String args[]){
		EChild e = new EChild();

		byte b = 1;
        int r1 = e.m(b); //m(byte b)
		System.out.println("r1: " + r1);

		int i = 2;
		int r2 = e.m(i); //m(int i)
		System.out.println("r2: " + r2);
		
	}
}
