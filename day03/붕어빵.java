class 붕어빵 {
	String 앙꼬 = "팥";
	boolean 익음 = false;
	boolean 타버림 = false;
	
	붕어빵() {
		this.prep();
	}
	붕어빵(String 앙꼬) {
		this.앙꼬 = 앙꼬;
		this.prep();
	}

	private void prep() {
		System.out.println(this.앙꼬 + " 붕어빵 반죽을 준비했다.\n");
	}

	void 굽다() {
		if (this.타버림) {
			System.out.println(this.앙꼬 + " 붕어빵을 구우려 했지만, 이미 타버려서 더이상 구울 수 없다.\n");
			return;
		}

		System.out.println(this.앙꼬 + " 붕어빵을 구웠다.");
		if (this.익음) {
			this.타버림 = true;
			System.out.println("이런, 태워 버렸다...\n");
		} else {
			this.익음 = true;
			System.out.println();
		}
	}
}
