class D4 
{
	void m4() {
		int j = 2;
		while (j <= 9) {
			int i = 1;
			while (i <= 9) {
				System.out.println(j + " * " + i + " = " + j * i);
				i++;
			}
			j++;
		}
	}

	public static void main(String[] args) 
	{
		new D4().m4();
	}
}
