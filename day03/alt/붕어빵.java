class 붕어빵 {
	String 앙꼬 = "팥";
	String 익음 = "안 익은";
	//boolean 타버림 = false;
	
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
		System.out.println(this.앙꼬 + " 붕어빵을 구웠다.\n");
		this.익음 = "잘 익은";
	}
}
