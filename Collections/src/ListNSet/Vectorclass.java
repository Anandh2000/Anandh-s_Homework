package ListNSet;

import java.util.Collections;
import java.util.Vector;

public class Vectorclass {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.add("hii");
		v.add("hello");
		v.add("abc");
		v.add("gn");
		v.add("ac");
		Collections.sort(v);
		System.out.println(v);
		System.out.println(v.get(3));
		v.setSize(10);
		System.out.println(v.size());
		System.out.println(v.capacity());
		System.out.println(v);
		v.insertElementAt("first", 1);
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.indexOf("hii"));
		for(String values : v) {
			System.out.println(values);
		}
		v.clear();
		System.out.println(v);
		System.out.println(v.isEmpty());
	}

}
