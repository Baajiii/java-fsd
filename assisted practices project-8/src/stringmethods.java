import java.util.Scanner;

public class stringmethods {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a = sc.next();
		String b =sc.next();
		String c =sc.next();
		String d = sc.next();
		 System.out.println(a.length());
		 System.out.println(a.substring(3));
		 System.out.println(a.compareTo(b));
		 System.out.println(c.isEmpty());
		 System.out.println(b.toLowerCase());
		 System.out.println(a.equals(b));
		 System.out.println(a.replace('a','b'));
		System.out.println("Stringbuffer");
		StringBuffer s = new StringBuffer(c);
		System.out.println(s.append("hansa"));
		System.out.println(s.delete(0, 2));
		System.out.println(s.insert(0, 'H'));
		System.out.println("StringBulider");
		StringBuilder f = new StringBuilder(d);
		System.out.println(f.append("super"));
		System.out.println(f.insert(0, "welcome"));
		System.out.println(f.reverse());
		System.out.println();
	}

}
