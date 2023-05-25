class D 
{
	int sum(int i, int j){
		return i+j;
	}
	public static void main(String[] args) 
	{
		int r = new D().sum(100, 200);
		System.out.println("r: " + r);
	}
}
