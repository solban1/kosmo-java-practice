package aa.bb;

class A {
	private String name = "ȫ�浿";
	A(){
		System.out.println("A()");
	}
	private void m(){
		System.out.println("m()");
	}
	void useSelf(){
		new A(); //������ ���  
		System.out.println("name: " + name); //��� ��� 
		m(); //�޼ҵ� ��� 
	}
}
