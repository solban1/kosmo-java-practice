//import java.util.ArrayList;
//import java.util.Optional;

class 사장 {
	String 별명 = "아주머니";
	//ArrayList<붕어빵> 진열대 = new ArrayList<붕어빵>();
	붕어빵 빵;

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
		this.빵 = new 붕어빵(종류);
	}
	void 준비하다() {
		this.준비하다("팥");
	}

	void 굽다() {
		//System.out.println(this.별명 + "이(가) " + 종류 + " 붕어빵을 구우려고 한다.");
		System.out.print(this.별명 + "은(는) ");
		this.빵.굽다();
	}

	붕어빵 팔다() {
		System.out.println(this.별명 + ": " + this.빵.앙꼬 + " 붕어빵 나왔습니다.\n");
		return this.빵;
	}
}
