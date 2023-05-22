//import java.util.Optional;

class 손님 {
	String 이름 = "손님";
	//int 돈 = 0;
	//Optional<붕어빵> 빵 = Optional.empty();
	붕어빵 빵;

	손님() {
		this.intro();
	}
	손님(String 이름) {
		this.이름 = 이름;
		this.intro();
	}

	private void intro() {
		System.out.println(this.이름 + "이(가) 입장했다.\n");
	}

	void 산다(사장 주인) {
		System.out.println(this.이름 + ": " + 주인.별명 + ", 붕어빵 하나 주세요.");
		this.빵 = 주인.팔다();
	}

	void 먹다() {
		System.out.println(this.이름 + "은(는) " + this.빵.익음 + " " + this.빵.앙꼬 + " 붕어빵을 먹었다.\n");
	}
}
