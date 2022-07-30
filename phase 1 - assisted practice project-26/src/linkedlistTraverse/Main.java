package linkedlistTraverse;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {

		List<Integer> list = new LinkedList<>();
		list.add(25);
		list.add(65);
		list.add(85);
		list.add(98);
		list.add(21);
		list.add(32);
		list.add(24);
		System.out.println(list);
		int n = list.size();
//		System.out.println(n-1);
		for(int i = n - 1;i>=0;i--) {
		System.out.print(list.get(i) + " ");
		}
}}