interface GI{
	void m();
}
class G {
	int i = 0;//���   
	void use(int j){ //����(��)
		int k = 2;//����(����)

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
