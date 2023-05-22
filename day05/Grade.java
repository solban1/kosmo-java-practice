class Grade {
	void calc(String[] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			try {
				sum += Integer.parseInt(args[i]);
			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
				return;
			}
			System.out.println("과목 " + i + ": " + args[i]);
		}

		double avg = (double)sum / args.length;
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
		
		String grade;
		if (avg >= 95.0) {
			grade = "A+";
		} else if (avg >= 90.0) {
			grade = "A0";
		} else if (avg >= 85.0) {
			grade = "B+";
		} else if (avg >= 80.0) {
			grade = "B0";
		} else if (avg >= 75.0) {
			grade = "C+";
		} else if (avg >= 70.0) {
			grade = "C0";
		} else if (avg >= 60.0) {
			grade = "D+";
		} else if (avg >= 50.0) {
			grade = "D0";
		} else {
			grade = "F";
		}
		System.out.println("학점: " + grade);
	}

	public static void main(String[] args) {
		if (args.length == 0) {
			System.err.println("과목 점수를 1개 이상 입력하세요.");
			return;
		}

		new Grade().calc(args);
	}
}
