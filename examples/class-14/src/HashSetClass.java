import java.util.*;

public class HashSetClass {
	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("B");
		s.add("B");
		s.add("C");
		s.add("A");

		System.out.println(s);
		System.out.println(s.contains("D"));
		s.remove("B");
		System.out.println(s);

		for (String val : s) {
			System.out.println(val);
		}

		System.out.println(s.hashCode());
		System.out.println(s.isEmpty());
	}
}
