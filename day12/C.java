class COut {
	interface CInter {
		int I = 10; //�ڿ� ��� 
		void m(); //�߻� �޼ҵ�
		//class CInInter{}
	}
}
class CInterChild implements COut.CInter{
	public void m(){
		System.out.println("m() ����");
	}
}

class C {
	public static void main(String args[]){
		COut.CInter inter = new CInterChild();
		System.out.println("inter.I: " + inter.I);
		System.out.println("COut.CInter.I: " + COut.CInter.I);
		inter.m();
	}
}
