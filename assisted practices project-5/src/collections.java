import java.util.*;

public class collections {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("One");
		a.add(2);
		a.add("Three");
		a.add(4);
		a.add("Five");
		System.out.println("ArrayList:");
		System.out.println(a);
		LinkedList l = new LinkedList();
		l.add("6");
		l.add("Seven");
		l.add("8");
		l.add("Nine");
		System.out.println("LinkedList:");
		System.out.println(l);
		HashSet h = new HashSet();
		h.add(100);
		h.add(200);
		h.add(300);
		h.add(400);
		System.out.println("Hashset:");
		System.out.println(h);
		System.out.println("Hashset:");
		Iterator i = h.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("LinkedList:");
		Iterator t = l.iterator();
			while(t.hasNext()) {
				System.out.println(t.next());
			}
			System.out.println("ArrayList:");
			Iterator A = a.iterator();
			while(A.hasNext()) {
				System.out.println(A.next());
			}
		}
	}

