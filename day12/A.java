abstract interface AInter1{
    public static final int I = 0;
	public abstract void m1();
	static void m2(){
		System.out.println("m2()");	
	}
	public default void m3(){
		System.out.println("m3()");
	}
}  
interface AInter2 {
	void m4();
}
interface AInter extends AInter1, AInter2 {
	void m5();
}

class AInterChild implements AInter
{
	public void m1(){ //오버라이딩
		System.out.println("m1()");	
	}
	public void m4(){
		System.out.println("m4()");	
	}
	public void m5(){
		System.out.println("m5()");	
	}
}

class A {  //인터페이스 객체를 만들어서 사용하시오 
	public static void main(String[] args) 
	{
		AInter child = new AInterChild(); 
		System.out.println("child.I: " + child.I);
		child.m1();
		AInter1.m2();
		child.m3();
		child.m4();
		child.m5();

		AInter1 a1 = child;
		AInter2 a2 = child;
	}
}
