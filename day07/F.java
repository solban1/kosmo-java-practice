class F 
{
	String strs[] = {"��", "����", "����", "�ܿ�"}; 
	void out(){
		for(String item: strs){
			System.out.println("item " + item);
		}
	}
	public static void main(String[] args) 
	{
		F f = new F();
		f.out();
	}
}
