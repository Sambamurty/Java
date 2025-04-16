package multithreading;
class Counter{
	private int count;
	//Synchronized Method
	public synchronized void increment()
	{
		count++;
		System.out.println("Incremented : "+count);
	}
	public void decrement() {
		//Synchronized Block
		synchronized(this)
		{
			count--;
			System.out.println("decremented : "+count);
		}
	}
	public int getCount() {
		return count;
	}
	
}
class IncrementThread extends Thread{
	private Counter counter;
	public void run(){
		for(int i=0;i<5;i++)
		{
			counter.increment();
		}
	}
	public IncrementThread(Counter counter) {
		super();
		this.counter = counter;
	}
	
	
}
class DecrementThread extends Thread{
	private Counter counter;
	public DecrementThread(Counter counter) {
		super();
		this.counter = counter;
	}

	public void run(){
		for(int i=0;i<5;i++)
		{
			counter.decrement();
		}
	}
}
public class A3Syncronization {
	public static void main(String[] args) throws InterruptedException {
	Counter counter = new Counter();
	Thread incrementThread1 = new IncrementThread(counter);
	Thread incrementThread2 = new IncrementThread(counter);
	
	Thread decrementThread3 = new DecrementThread(counter);
	Thread decrementThread4 = new DecrementThread(counter);
	
	incrementThread1.start();
	incrementThread2.start();
	decrementThread3.start();
	decrementThread4.start();
	incrementThread1.setName("Samba");
	System.out.println(incrementThread1.getName());
	try {
		incrementThread1.join();
		incrementThread2.join();
		decrementThread3.join();
		decrementThread4.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Final Count :"+counter.getCount());
	}
	
}
