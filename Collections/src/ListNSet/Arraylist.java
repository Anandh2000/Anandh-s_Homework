package ListNSet;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
	public static void main(String args[]) {
	ArrayList<Integer> a = new ArrayList<>();
	a.add(45);
	a.add(25);
	a.add(2);
	a.add(11);
	a.add(30);
	a.add(18);
	System.out.println(a.get(3));
	System.out.println(a);
	Collections.rotate(a, 4);
	System.out.println(a);
	Collections.sort(a);
	System.out.println(a);
	Collections.reverse(a);
	System.out.println(a);
	System.out.println(Collections.max(a));
	System.out.println(a.indexOf(11));
	
	for(int values : a) {
		System.out.println(values);
	}
	System.out.println(a);
}


}
