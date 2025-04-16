package multithreading;
class NumbersRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1;i<=26;i++)
		{
			System.out.print(i+" ");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
}
class AlphabetsRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(char c='a';c<='z';c++)
		{
			System.out.print(c+"-");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class A2impRunnable {
	public static void main(String[] args) {
		NumbersRunnable nrObj = new NumbersRunnable();
		AlphabetsRunnable arObj = new AlphabetsRunnable();
		//Thread t1 = new Thread(nrObj);
		Thread t2 = new Thread(nrObj);
		Thread t3 = new Thread(arObj);
		t2.start();
		t3.start();
	}
}
