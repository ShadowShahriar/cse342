import java.util.*;

public class PriorityQueueClass {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Geek1", 1);
		m.put("Geek2", 2);
		System.out.println(m);

		Map<Integer, String> n = new HashMap<>();
		n.put(new Integer(4), "F");
		n.put(4, "F");
		n.put(5, "F");
		n.remove(4);
		System.out.println(n);

		for (Map.Entry<Integer, String> mapElem : n.entrySet()) {
			int key = (int) mapElem.getKey();
			System.out.println(key);
		}
	}
}
