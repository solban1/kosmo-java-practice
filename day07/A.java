class A
{
	//String strs[]; //(1)����
	String strs[] = new String[4]; //���� �� �ʱ�ȭ 
	
	A(){
		//strs = new String[4]; //(2)���� 
	}
	void in(){
		strs[0] = "��"; strs[1] = "����"; strs[2] = "����"; strs[3] = "�ܿ�"; //(3)�ʱ�ȭ
	}
	void out(){
		for(int i=0; i<strs.length; i++){
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.in();
		a.out();
	}
}
