import java.util.EnumSet;

public class D5 {
	private static enum Day {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
	}

	private static void m() {
		Day d = Day.TUESDAY;
		System.out.println(d == Day.MONDAY);

		System.out.println(EnumSet.of(Day.MONDAY, Day.TUESDAY).contains(d));
	}
	
	public static void main(String[] args) {
		m();
	}
}
