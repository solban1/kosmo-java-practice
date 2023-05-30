abstract class D 
{
	//abstract int i; 
	//abstract D();
	abstract void m1(); //추상메소드 
	void m2(){ //일반메소드 
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
		//'D객체를 만들어서', 사용해보세요 
		D d = new DChild(); //객체생성
		d.m1();//추상메소드
		d.m2();//일반메소드
	}
}

