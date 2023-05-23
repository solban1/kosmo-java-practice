public class Star {
	private static void printStar(int size, boolean reverseX, boolean reverseY) {
		for (int y = 0; y < size; y++) {
			for (int x = 0; x < size; x++) {
				int convertedX = reverseX ? size - x - 1 : x;
				int convertedY = reverseY ? size - y - 1 : y;
				if (convertedY >= convertedX) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		printStar(4, false, false);
		printStar(4, true, false);
		printStar(4, false, true);
		printStar(4, true, true);
	}
}
