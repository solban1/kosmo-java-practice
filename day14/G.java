interface GI{
	void m();
}
class G {
	int i = 0;//멤버   
	void use(int j){ //지역(파)
		int k = 2;//지역(선초)

		GI gi = () -> {
			System.out.println("i: " + i);
			System.out.println("j: " + j);
			System.out.println("k: " + k);
		};

		gi.m();
	}
	public static void main(String[] args) 
	{
		G g = new G();
		g.use(1);
	}
}
