class DOut 
{
	private int i = 1; 
	void m(){
		System.out.println("m()");
	}
	void call(){
		new DHandler(this).use();
	}
	int getI(){
		return i;
	}

	class DIn {
		void use(){
			System.out.println("i: " + i);	
			m();
		}
	}
}

class D {
	public static void main(String args[]){
		DOut.DIn in = new DOut().new DIn();
		//in.use(); //����Ŭ�������� ȣ��

		new DOut().call(); //��3Ŭ�������� ȣ�� 
	}
}
