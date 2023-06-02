class RunChild implements Runnable {
	public void run(){
		while(true){
			System.out.println("쓰레드 일1");
			try{ Thread.sleep(1000); }catch(Exception e){}
		}
	}
}

class H 
{
	void use1(){
		Runnable r = new RunChild();
		Thread th = new Thread(r);
		th.start();
	}
	void use2(){
		Runnable r = new Runnable(){
			public void run(){
				while(true){
					System.out.println("쓰레드 일2");
					try{ Thread.sleep(1000); }catch(Exception e){}
				}
			}
		};
		Thread th = new Thread(r);
		th.start();
	}
	void use3(){
		Runnable r = () -> {
			while(true){
				System.out.println("쓰레드 일3");
				try{ Thread.sleep(1000); }catch(Exception e){}
			}
		};
		Thread th = new Thread(r);
		th.start();
	}
	void use4(){
		Runnable r = () -> work();
		Thread th = new Thread(r);
		th.start();
	}
	void work(){
		while(true){
			System.out.println("쓰레드 일4");
			try{ Thread.sleep(1000); }catch(Exception e){}
		}
	}
	void use5(){
		new Thread(() -> {
			while(true){
				System.out.println("쓰레드 일5");
				try{ Thread.sleep(1000); }catch(Exception e){}
			}
		}).start();
	}
	public static void main(String[] args) 
	{
		H h = new H();
		//h.use1();
		//h.use2();
		//h.use3();
		//h.use4();
		h.use5();
	}
}
