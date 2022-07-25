package Encapsulation;

public class bankaccount {
private String accountNumber;
private String accountName;
private String Branch;
bankaccount(String accountNumber, String accountName, String Branch){
	this.accountName= accountName;
	this.accountNumber = accountNumber;
	this.Branch = Branch;
}

void printdetails() {
	System.out.println("Account Number: " + accountNumber + " Account Name : " + accountName + " Branch Name: " + Branch  );
	
}

}
