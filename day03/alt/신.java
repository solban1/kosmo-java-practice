class 신 {
	public static void main(String[] args) {
		System.out.println("때는 어느 추운 겨울날.\n");

		사장 주인 = new 사장("사장님");
		주인.준비하다("팥");
		주인.굽다();

		손님 철수 = new 손님("철수");
		철수.산다(주인);
		철수.먹다();

		주인.준비하다("슈크림");

		손님 영희 = new 손님("영희");
		영희.산다(주인);
		영희.먹다();
	}
}
