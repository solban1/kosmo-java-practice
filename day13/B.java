class B implements Runnable {
	void m(){
		new Thread(this).start();
		while(true){
			System.out.println("main������ ��");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public void run(){
		for(int i=0; i<5; i++){
			System.out.println("baby������ ��");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		B b = new B();
		b.m();
	}
}
