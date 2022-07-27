package linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		List<Integer> Link = new LinkedList<>();
		Link.add(25);
		Link.add(64);
		Link.add(123);
		Link.add(45);
		Link.add(68);
		System.out.println(Link);
		Link.remove(0);
		System.out.println("After delete the first occurences of the key in linked list: ");
		System.out.println(Link);
		
	}

}
