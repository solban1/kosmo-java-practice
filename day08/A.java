class Human {
	String name;
	Human(){
		this("������"); //new Human("ȫ�浿");
	}
	Human(String name){
		this.name = name;
	}
	void move(){
		System.out.println("�ȴ´�");
	}
}
class SuperMan extends Human {
	int power = 500;
	SuperMan(){
		super("Ŭ��"); //new Human("Ŭ��");
	}
	void move(){ //�������̵� 
		System.out.println("����");
	}	
	void shotBeam(){
		System.out.println("������ ���");
	}
}
class PepsiMan extends Human {
	int speed = 200;
	PepsiMan(String name){
		super(name); //new Human(name);
	}
	void move(){ //��������
		System.out.println("�޸���");
	}
}

class A{
	public static void main(String[] args) {
		Human m = new Human();
		System.out.println("m.name: " + m.name);
		m.move();
		System.out.println();

		//SuperMan sm = new SuperMan();
		Human man = new SuperMan(); //�ڵ�����ȯ 
		SuperMan sm = (SuperMan)man; //��������ȯ 
		System.out.println("sm.name: " + sm.name);
		System.out.println("sm.power: " + sm.power);
		sm.move();
		sm.shotBeam();
		System.out.println();

		//SuperMan sm2 = (SuperMan)m; //�߸��� ����ȯ(��O, ��X) 
		//sm2.move();

		PepsiMan pm = new PepsiMan("��ø�");
		System.out.println("pm.name: " + pm.name);
		System.out.println("pm.speed: " + pm.speed);
		pm.move();

		//SuperMan ssm = (SuperMan)pm; //�߸��� ����ȯ(��X)
	}
}

