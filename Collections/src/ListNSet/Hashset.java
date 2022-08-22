package ListNSet;

import java.util.HashSet;

public class Hashset {
	public static void main(String[] args) {
		HashSet<Integer> h = new HashSet<>();
		h.add(15);
		h.add(52);
		h.add(48);
		h.add(1);
		h.add(15);
		h.add(11);
		h.add(25);
		h.add(2);
		h.add(11);
		h.add(30);
		h.add(1);
		System.out.println(h);
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		h.clear();
		System.out.println(h.isEmpty());
	}

}
