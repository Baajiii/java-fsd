package classandobject;

import java.util.Scanner;

public class MyClass {
	public int method() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<=n ; i++)
		{
			sum+=i;
		}
		System.out.println("sum of the given number: " );
		return sum;
	}

}
