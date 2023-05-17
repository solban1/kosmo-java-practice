record Info (
	String name,
	int age
) {}

class B3 {
	Info info;

	B3() {
		info = new Info("홍길동", 20);
	}

	void show() {
		System.out.println("info.name: " + info.name() + ", info.age: " + info.age());
	}
}
