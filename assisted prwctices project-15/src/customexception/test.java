package customexception;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		test obj = new test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the withdran amount: ");

		int withdrawn = sc.nextInt();
		try {
			obj.withdrawnATM(2515, withdrawn);
			System.out.println("withdrawnAmont " + withdrawn);

		} catch (insufficientbalanceException ex) {
			System.out.println(ex.getMessage());

		} finally {
			System.out.println("Thankyou vist Again");
		}
	}

	public void withdrawnATM(int accountnumber, int withdrawn) {
		int balance = Balance(accountnumber);
		if (balance < withdrawn) {
			throw new insufficientbalanceException("Insufficient balance");
		}
	}

	private int Balance(int accountnumber) {
		return 2000;
	}

}
