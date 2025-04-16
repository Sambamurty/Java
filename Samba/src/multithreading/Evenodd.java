package multithreading;

public class Evenodd {
	private int i=1;
	private String b= "odd";
	public synchronized void evenPrint() throws InterruptedException
	{
		if(b.equals("odd"))
		{
			wait();
		}
		System.out.println("Even-"+i);
		i++;
		b="odd";
		notify();	
	}
	public synchronized void oddPrint() throws InterruptedException
	{
		if(b.equals("even"))
		{
			wait();
		}
		System.out.println("Odd-"+i);
		i++;
		b="even";
		notify();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evenodd obj = new Evenodd();
		Thread t1 = new Thread(()->{
			for(int j=0;j<5;j++)
			{
				try {
					obj.evenPrint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		Thread t2 = new Thread(()->{
			for(int j=0;j<5;j++)
			{
				try {
					obj.oddPrint();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		t1.start();
		t2.start();
	}

}
