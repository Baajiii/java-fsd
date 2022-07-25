package queue;

import java.util.LinkedList;
import java.util.Queue;

public class MyClass {
	public static void main(String[] args) {
		Queue q = new LinkedList();
		q.add("movies");
		q.add("Tom");
		q.add("and");
		q.add("jerry");
		q.add("Ben-10");
		q.add("chotta Bheem");
		System.out.println("Size of the queue : " + q.size());
		System.out.println(q);
		q.remove();
		System.out.println("Afetr removing element from the queue:");
		System.out.println(q);
		System.out.println("Size of the queue : " + q.size());
	}
}
