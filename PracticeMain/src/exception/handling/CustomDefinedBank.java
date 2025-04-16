package exception.handling;

import java.util.Scanner;

class InsufficentFunds extends RuntimeException{
	public InsufficentFunds(String s)
	{
		super(s);
	}
}
public class CustomDefinedBank {
	static Scanner sc = new Scanner(System.in);
	private double balance;
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	public void withDraw(double amount)
	{
		if(amount>balance)
		{
			throw new InsufficentFunds("Insufficent Funds");
		}
		else
		{
			balance = balance - amount;
			System.out.println("Withdraw Successful and your balance is : "+balance);
		}
	}
	public static void main(String[] args) {
		CustomDefinedBank bank = new CustomDefinedBank();
		bank.setBalance(sc.nextDouble());
		try {
			bank.withDraw(sc.nextDouble());
		} catch(InsufficentFunds e) {
			e.printStackTrace();
		}
	}

}
