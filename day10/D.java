abstract class D 
{
	//abstract int i; 
	//abstract D();
	abstract void m1(); //�߻�޼ҵ� 
	void m2(){ //�Ϲݸ޼ҵ� 
		System.out.println("m2()");
	}
}
class DChild extends D
{
	void m1(){
		System.out.println("m1()");
	}
}
class DUser
{
	public static void main(String[] args) 
	{
		//'D��ü�� ����', ����غ����� 
		D d = new DChild(); //��ü����
		d.m1();//�߻�޼ҵ�
		d.m2();//�Ϲݸ޼ҵ�
	}
}

