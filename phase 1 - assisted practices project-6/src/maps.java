
import java.util.*;

public class maps {
	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer, String>();
		h.put(1,"hello");
		h.put(2,"welcome");
		h.put(3,"hey");
		System.out.println("HashMap");
	      for(Map.Entry m:h.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
	    Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
	    ht.put(4,  "car");
	    ht.put(5, "bike");
	    ht.put(6, "cycle");
	    System.out.println();
	    System.out.println("HashTable");
	      for(Map.Entry s:ht.entrySet()){    
		       System.out.println(s.getKey()+" "+s.getValue());    
		      }


		
	}
}
