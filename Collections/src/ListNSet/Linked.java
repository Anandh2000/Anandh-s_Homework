package ListNSet;

import java.util.LinkedList;

public class Linked {
	public static void main(String[] args) {
		LinkedList<Integer> l = new LinkedList<>();
		l.add(25);
		l.add(2);
		l.add(9);
		l.add(25);
		l.add(4);
		l.addFirst(4);
		l.addLast(100);
		System.out.println(l);
		System.out.println(l.offerFirst(1));
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.peek());
		l.push(11);
		System.out.println(l);
		System.out.println(l.poll());
		System.out.println(l);
		System.out.println(l.pollLast());
		System.out.println(l);
		l.pop();
		System.out.println(l);
		
	}
}
