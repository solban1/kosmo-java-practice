class B
{
	String strs[] = {"��", "����", "����", "�ܿ�"}; //���� �� ���� �� �ʱ�ȭ 

	/* �ȵ�!! 
	String strs[];//���� 
	void in(){
		 strs = {"��", "����", "����", "�ܿ�"}; //���� �� �ʱ�ȭ 
	}*/
	void out(){
		for(int i=0; i<strs.length; i++){
			System.out.println("strs["+i+"]: " + strs[i]);
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		//b.in();
		b.out();
	}
}
