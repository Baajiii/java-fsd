package exceptionhandling;

public class exception extends Exception {
	public static void main(String[] args) {
		try {
			System.out.println("try block excuted");
			throw new Exception ("this message");
		}catch(Exception e) {
			System.out.println("exception occured");
		}
	}

}
