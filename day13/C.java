class Th1 extends Thread{
	public void run(){
		for(int i=0; i<1000; i++) {
			System.out.println("th1의 일");
		}	
	}
}
class Th2 implements Runnable {
	public void run(){
		for(int i=0; i<1000; i++) {
			System.out.println("th2의 일");
		}	
	}
}
class C extends Thread 
{
	C(){
		/*
		System.out.println("Thread.MAX_PRIORITY: " + Thread.MAX_PRIORITY);
		System.out.println("Thread.MIN_PRIORITY: " + Thread.MIN_PRIORITY);
		System.out.println("Thread.NORM_PRIORITY: " + Thread.NORM_PRIORITY);

		int priority1 = getPriority();
		System.out.println("priority1: " + priority1);

		setPriority(Thread.MAX_PRIORITY);
		int priority2 = getPriority();
		System.out.println("priority2: " + priority2);*/

		Thread th1 = new Th1();
		th1.setPriority(Thread.MAX_PRIORITY);
		th1.start(); //첫번째 쓰레드 

		Runnable r = new Th2();
		Thread th2 = new Thread(r);
		th2.setPriority(Thread.MIN_PRIORITY);
		th2.start(); //두번째 쓰레드 
	}
	public static void main(String[] args) 
	{
		new C();
	}
}
