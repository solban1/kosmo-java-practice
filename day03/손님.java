import java.util.Optional;

class 손님 {
	String 이름 = "손님";
	//int 돈 = 0;
	Optional<붕어빵> 빵 = Optional.empty();

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

	void 산다(사장 주인, String 종류) {
		System.out.println(this.이름 + ": " + 주인.별명 + ", " + 종류 + " 붕어빵 하나 주세요.");
		this.빵 = 주인.팔다(종류);
	}

	void 먹다() {
		if (this.빵.isEmpty()) {
			System.out.println(this.이름 + "은(는) 붕어빵을 먹으려 했지만, 자신의 빈 손을 멍하니 바라보다가 이내 시려워진 손을 주머니에 넣는다.\n");
		} else {
			붕어빵 먹을빵 = this.빵.get();
			this.빵 = Optional.empty();
			System.out.println(this.이름 + "은(는) 손에 든 " + 먹을빵.앙꼬 + " 붕어빵을 먹었다.");

			System.out.print(this.이름 + ": ");
			if (!먹을빵.익음) {
				System.out.println("우웩, 안 익었잖아!");
			} else if (먹을빵.타버림) {
				System.out.println("타버렸잖아, 이걸 먹으라고 준 거야?");
			} else {
				System.out.println("환상적인 맛이에요. 잘 먹었습니다.");
			}
			System.out.println();
		}
	}
}
