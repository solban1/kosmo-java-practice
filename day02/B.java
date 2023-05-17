//import java.lang.*;	// default import

public class B {
	String name = "B";
	int age = 10;

	public B() {}

	public B(String n) {
		name = n;
	}

	public B(int a) {
		age = a;
	}

	public B(String n, int a) {
		name = n;
		age = a;
	}

	/**
	 * Prints description of the instance.
	 */
	public void show() {
		System.out.println("이 인스턴스의 이름은 " + name + "이고, 나이는 " + age + "입니다.");
	}

	
}
