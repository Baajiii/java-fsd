package SortingLinkedList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(56);
		list.add(21);
		list.add(32);
		list.add(20);
		list.add(74);
		list.add(2);
		Collections.sort(list);
		System.out.println(list);
		list.add(30);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
	}

}
