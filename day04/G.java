class G 
{
	void m1(){
		int max = Integer.MAX_VALUE; //�Ӽ� 
		System.out.println("max: " + max);
	}
	void m2(){
		String s = "10";
		int i = 20;
		int r = Integer.parseInt(s) + i; //�޼ҵ�
		System.out.println("r: " + r);
	}
	public static void main(String[] args) 
	{
		G g = new G();
		//g.m1();
		g.m2();
	}
}
