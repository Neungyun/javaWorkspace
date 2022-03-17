/**
 * AccountTest.java
 * 
 * make some accounts and request variety services
 */

package week3;
public class Transaction {
	public static void main(String[] args) {
		Account acct1 = new Account ("Ted Murphy", 72354, 102.56);
		Account acct2 = new Account ("Jane Smith", 69713, 40.00);
		Account acct3 = new Account ("Edward Demsey", 93757, 759.32);

		acct1.deposit(25.85);
		double smithBalance = acct2.deposit(500.00);
		System.out.println ("Smith balance after deposit: "   +   smithBalance);
		System.out.println ("Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));

		acct1.addInterest();
		acct2.addInterest();
		acct3.addInterest();

		System.out.println ();
		System.out.println (acct1);
		System.out.println (acct2);
		System.out.println (acct3);
		
	}
}

class Account{
	private String name;
	private long number;
	private double balance;
	
	public Account(String person,long no, double amount) {
		name = person;
		number = no;
		balance = amount;
	}
	
	public double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw(double amount, double commission) {
		if(amount + commission <= balance)
			balance = balance - (amount + commission);
		else {
			System.out.println("Insufficient Balance");
			System.out.println("Withdrawal didn't approved");
		}
		
		return balance;
	}
	
	public void addInterest() {
		double RATE = 0.035;
		balance = (1 + RATE) * balance;
	}
	
	public String toString() {
		return (number + "\t" + name +"\t" + String.format("$%.0f", balance));
	}
}




