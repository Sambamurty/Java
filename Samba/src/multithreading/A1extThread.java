package multithreading;

class Runner extends Thread{
	public Runner(String name) {
		super(name);
	}

	public void run() {
		for(int i=0;i<26;i++)
		{
			System.out.print(i+" ");
			/*try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
class Runner2 extends Thread{
	public void run()
	{
		for(char c='a';c<='z';c++)
		{
			System.out.print(c+"-");
			/*try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}*/
		}
	}
}
public class A1extThread {
	public static void main(String[] args) throws InterruptedException {
		Runner one = new Runner("Number incrementer");//setting name without setName()
		Runner2 two = new Runner2();
		one.start();
		two.start();
		two.setName("Alphabet Printer");//setting name with setName()
		one.join();
		two.join();
		System.out.println(one.getName()+" "+two.getName());
	}
}
