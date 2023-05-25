class Human {
	String name;
	Human(){
		this("강감찬"); //new Human("홍길동");
	}
	Human(String name){
		this.name = name;
	}
	void move(){
		System.out.println("걷는다");
	}
}
class SuperMan extends Human {
	int power = 500;
	SuperMan(){
		super("클락"); //new Human("클락");
	}
	void move(){ //오버라이딩 
		System.out.println("난다");
	}	
	void shotBeam(){
		System.out.println("광선을 쏘다");
	}
}
class PepsiMan extends Human {
	int speed = 200;
	PepsiMan(String name){
		super(name); //new Human(name);
	}
	void move(){ //오버라이
		System.out.println("달린다");
	}
}

class A{
	public static void main(String[] args) {
		Human m = new Human();
		System.out.println("m.name: " + m.name);
		m.move();
		System.out.println();

		//SuperMan sm = new SuperMan();
		Human man = new SuperMan(); //자동형변환 
		SuperMan sm = (SuperMan)man; //강제형변환 
		System.out.println("sm.name: " + sm.name);
		System.out.println("sm.power: " + sm.power);
		sm.move();
		sm.shotBeam();
		System.out.println();

		//SuperMan sm2 = (SuperMan)m; //잘못된 형변환(컴O, 실X) 
		//sm2.move();

		PepsiMan pm = new PepsiMan("펩시맨");
		System.out.println("pm.name: " + pm.name);
		System.out.println("pm.speed: " + pm.speed);
		pm.move();

		//SuperMan ssm = (SuperMan)pm; //잘못된 형변환(컴X)
	}
}

