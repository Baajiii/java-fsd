import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		int s;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number : ");
	int a = sc.nextInt();
	System.out.println("Enter the second number : ");
	int b = sc.nextInt();
	System.out.println("Enter the operator : ");
	char c = sc.next().charAt(0);
	if(c == '+')
	{
		s = a+b;
		System.out.println("Addition of two numbers is: " + s);
	}
	else if(c == '-')
	{
		s = a-b;
		System.out.println("subraction of two numbers is: " + s);
	}
	else if(c == '/')
	{
		s = a/b;
		System.out.println("Division of two number is: " + s);
	}
	else if(c == '*')
	{
		s = a*b;
		System.out.println("Multipilication of two numbers is : " + s);
	}
	else
	{
		System.out.println("Enter the correct operator");
	}
	}
	

}
