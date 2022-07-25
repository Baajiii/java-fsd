package throwexcep;

import java.util.Scanner;

public class throww {

	public static void main(String[] args){
		throww obj = new throww();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdrawamount: ");
		
		int withdrawn = sc.nextInt();
		try {
			obj.withdrawnATM(2515, withdrawn);
			System.out.println("withdrawnAmont " + withdrawn);
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
	
		}finally {
			System.out.println("Thank You Visit Again");
		}
	}
	public void withdrawnATM(int accountnumber, int withdrawn)
	{
		int balance = Balance(accountnumber);
		if(balance < withdrawn)
		{
			throw new RuntimeException("Insufficient balance");
		}
	}
	private int Balance(int accountnumber)
	{
		return 2000;
	}

}
