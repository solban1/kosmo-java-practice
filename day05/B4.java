class B4 {
	static enum Subject {
		국어, 수학, 영어, 사탐, 과탐, 한문
	}

	static void m1() {
		final Subject s = Subject.영어;

		switch (s) {
			case 국어:
				System.out.println("국어");
				break;
			case 수학:
				System.out.println("수학");
				break;
			case 영어:
				System.out.println("영어");
				break;
			case 사탐:
				System.out.println("사탐");
				break;
			case 과탐:
				System.out.println("과탐");
				break;
			case 한문:
				System.out.println("한문");
				break;
			default:
				System.err.println("오류");
				break;
		}
	}

	public static void main(String[] args) {
		m1();
	}
}
