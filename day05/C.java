class C 
{
	void m1(){ //while�� 
		int i=0; //�ʱ�� 
		while(i<3){ //���ǽ� 
			System.out.println("(1)i: " + i);
			i++; //������
		}
	}
	void m2(){ //dowhile�� 
		int i=0; //�ʱ��
		do{
			System.out.println("(2)i: " + i);
			i++; //������
		}while(i<3); //���ǽ� 
	}
	void m3(){ //for�� 
		for(int i=0; i<3; i++){
			System.out.println("(3)i: " + i);
		}
	}
	void m4(){
		//while(true){
		for(;;){
			System.out.println("�׼�");
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
	public static void main(String[] args) 
	{
		C c = new C();
		//c.m1();
		//System.out.println();
		//c.m2();
		//c.m3();
		c.m4();
	}
}
