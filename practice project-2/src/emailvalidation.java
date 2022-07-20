
import java.util.*;

public class emailvalidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email to be find: ");
		String s = sc.next();
	 List <String> list = new ArrayList<String>(); 
	  list.add("basith@gmail.com");
	  list.add("hello@gmail.com");
	  list.add("abdul@gmail.com");
	  list.add("rifan@gmail.com");
	  list.add("ajee@gmail.com");
	  list.add("welcome@gmail.com");

	  //Load the list into a hashSet
	  HashSet<String> set = new HashSet<String>(list);
	  if (set.contains(s))
	  {
	    System.out.println("Email is found " );
	  }
	  else
	  {
		  System.out.println("Email is not found, try with another id");
	  }
	}
}
