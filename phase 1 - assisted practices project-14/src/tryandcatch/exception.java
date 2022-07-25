package tryandcatch;

public class exception {
	public static void main(String[] args) {
		int c;
		try {
		c=1/0;
		System.out.println(c);
		}catch(ArithmeticException e)
		{
			System.out.println("change the number ");
		}
	}

}
