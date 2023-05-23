import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class D4 {
	private static void m() {
		System.out.println(new ArrayList<String>() instanceof AbstractList);
		System.out.println(new ArrayList<String>() instanceof Object);
		System.out.println(new ArrayList<String>() instanceof List);
		System.out.println(new ArrayList<String>() instanceof Collection);
		System.out.println(new ArrayList<String>() instanceof Vector);
	}

	public static void main(String[] args) {
		m();
	}
}
