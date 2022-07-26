package RangeQuries;

import java.util.Scanner;

public class SumOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the L");
		int L = sc.nextInt();
		System.out.println("Enter the R");
		int R = sc.nextInt();
		int sum=0;
		for(int i=L;i<=R;i++)
		{
			sum+=i;
		}
		System.out.println("Sum of the Range between L to R = " + sum);
	}

}
