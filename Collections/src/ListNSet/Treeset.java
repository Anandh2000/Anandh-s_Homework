package ListNSet;

import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(4);
		ts.add(10);
		ts.add(74);
		ts.add(55);
		ts.add(65);
		ts.add(5);
		ts.add(74);
		ts.add(55);
		System.out.println(ts);
		System.out.println(ts.higher(16));
		System.out.println(ts.ceiling(16));
		System.out.println(ts.first());
		System.out.println(ts.floor(20));
		System.out.println(ts.lower(12));
		System.out.println(ts);
	}

}
