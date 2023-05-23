class F 
{
	String strs[] = {"봄", "여름", "가을", "겨울"}; 
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
