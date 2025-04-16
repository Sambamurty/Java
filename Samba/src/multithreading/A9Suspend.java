package multithreading;
class Number extends Thread{
	private boolean suspendFlag = false;
	public void run()
	{
		 try {
	            for (int i = 0; i <= 10; i++) {
	                System.out.print(i + " ");
	            }
	            suspendThread();
	            while (suspendFlag) {
	                Thread.sleep(100);
	            }
	            for (int i = 11; i < 25; i++) {
	                System.out.print(i + " ");
	            }
	         }
	        catch (InterruptedException e) {
	            System.out.println("Thread interrupted.");
	        }
	}
	synchronized void suspendThread() {
        suspendFlag = true;
    }

    synchronized void resumeThread() {
        suspendFlag = false;
        notify();
    }
}
class Alphabets extends Thread{
	public void run()
	{
		for(char i='a';i<='z';i++)
		{
			System.out.print(i+" ");
		}
	}
}
public class A9Suspend {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Number t1 = new Number();
		Alphabets t2 = new Alphabets();
		t1.start();
		t2.start();
		Thread.sleep(1000); // Wait for a moment before resuming t1
        synchronized (t1) {
            t1.resumeThread();
        }
	}

}
