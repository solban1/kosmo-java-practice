class C 
{
	int is[] = new int[2];
	boolean flags[] = new boolean[2];

	void out(){
		for(int i=0; i<is.length; i++){
			System.out.println("is["+i+"]: " + is[i]);
		}

		for(int i=0; i<is.length; i++){
			System.out.println("flags["+i+"]: " + flags[i]);
		}
	}
	public static void main(String[] args) {
		C c = new C();
		c.out();
	}
}
