import java.util.ArrayList;
import java.util.Optional;

class 사장 {
	String 별명 = "아주머니";
	ArrayList<붕어빵> 진열대 = new ArrayList<붕어빵>();

	사장() {
		this.intro();
	}
	사장(String 별명) {
		this.별명 = 별명;
		this.intro();
	}

	private void intro() {
		System.out.println(this.별명 + "이(가) 붕어빵집을 열었다.\n");
	}

	void 준비하다(String 종류) {
		System.out.print(this.별명 + "은(는) ");
		this.진열대.add(new 붕어빵(종류));
	}
	void 준비하다() {
		this.준비하다("팥");
	}

	void 굽다(String 종류) {
		//System.out.println(this.별명 + "이(가) " + 종류 + " 붕어빵을 구우려고 한다.");
		System.out.print(this.별명 + "은(는) ");
		Optional<붕어빵> 빵 = this.pickup(종류);

		if (빵.isEmpty()) {
			System.out.println(종류 + " 붕어빵을 구우려 했지만, 진열대에 " + 종류 + " 붕어빵이 없다.\n");
		} else {
			붕어빵 구울빵 = 빵.get();
			구울빵.굽다();
			진열대.add(구울빵);
		}
	}

	Optional<붕어빵> 팔다(String 종류) {
		Optional<붕어빵> 빵 = this.pickup(종류);

		if (빵.isEmpty()) {
			System.out.println(this.별명 + ": " + 종류 + " 붕어빵은 아직 준비 중이에요.\n");
		} else {
			System.out.println(this.별명 + ": " + 종류 + " 붕어빵 나왔습니다.\n");
		}
		return 빵;
	}

	private Optional<붕어빵> pickup(String 종류) {
		for (int i = 0; i < this.진열대.size(); i++) {
			붕어빵 빵 = this.진열대.get(i);
			if (빵.앙꼬 == 종류) {
				return Optional.of(this.진열대.remove(i));
			}
		}
		return Optional.empty();
	}

}
