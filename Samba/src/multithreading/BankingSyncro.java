package multithreading;

class Bank{
	static Bank b = new Bank();
	double balance = 0;
	synchronized void deposite(double amount)
	{
		balance = balance+ amount;
	}
	
}
class Person1 extends Thread{
	public void run()
	{
		Bank.b.deposite(1000);
	}
}
class Person2 extends Thread{
	public void run()
	{
		Bank.b.deposite(2000);
	}
}
class Person3 extends Thread{
	public void run()
	{
		Bank.b.deposite(5000);
	}
}
class Person4 extends Thread{
	public void run()
	{
		Bank.b.deposite(5000);
	}
}
class Person5 extends Thread{
	public void run()
	{
		Bank.b.deposite(2000);
	}
}
class Person6 extends Thread{
	public void run()
	{
		Bank.b.deposite(5000);
	}
}
public class BankingSyncro {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Person1 p1 = new Person1();
		Person2 p2 = new Person2();
		Person3 p3 = new Person3();
		Person4 p4 = new Person4();
		Person5 p5 = new Person5();
		Person6 p6 = new Person6();
		p1.start(); 
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p4.join();
		p5.join();
		p6.join();
		p1.join();
		p2.join();
		p3.join();
		System.out.println(Bank.b.balance);
	}

}
