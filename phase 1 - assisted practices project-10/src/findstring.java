import java.util.Scanner;

public class findstring {

		   public static void main(String[] args) {
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter the string");
			   String s = sc.next();
			   System.out.println("Enter the string to be find");
			   String d = sc.next();
		      int Index = s.indexOf(d);
		      
		      if(Index == - 1) {
		         System.out.println("string not found");
		      } else {
		         System.out.println("Found string at index ");
		      }
		   }
		}

