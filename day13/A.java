class A extends Thread {
	void m(){
		start();
		while(true){
			System.out.println("main쓰레드 일");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public void run(){
		while(true){
			System.out.println("baby쓰레드 일");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m();
	}
}
