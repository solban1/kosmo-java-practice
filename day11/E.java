class E {
	E(){} //������ �����ε� 
	E(int i){}
	E(String s){}
	E(int i, String s){}

	void m(){} //�޼ҵ� �����ε� 
	int m(int i){ return i; }
	String m(String s, int i){ return s; }
	//byte m(byte b){ return b; } //�����ε�
}
class EChild extends E{
	void m(String s){} //�����ε� 
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
