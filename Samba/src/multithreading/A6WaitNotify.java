package multithreading;

import java.util.Scanner;

class PadChanging{
	private final int padRemoveTime = 6;
	private int padWearTime;
	static Scanner sc = new Scanner(System.in);
	public void padWearingTime(int padWearTime) throws InterruptedException
	{
		this.padWearTime = padWearTime;
		synchronized(this) {
			int time=padRemoveTime-padWearTime;
			if(time>0)
			{
				wait();
			}
			Thread.sleep(time*10000);
			System.out.println("It has been "+time+"hours.So, please Remove your Pad.");
		}
	}
	public synchronized void timeRemainingToRemove()
	{
		System.out.println("Still you can wear the pad for "+(padRemoveTime-padWearTime)+"Hours.");
		System.out.println("Come again after sometime then enter the time your pad from starting.");	
		notify();
	}
}
public class A6WaitNotify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 PadChanging pc = new PadChanging();
		 Thread padWearThread = new Thread(()->
		 {
			 try {
				 pc.padWearingTime(3);
			 }
			 catch(InterruptedException e){
				 e.printStackTrace();
			 }
		 }
		 );
		 
		 Thread timeRemThread = new Thread(()->
		 {
			 pc.timeRemainingToRemove();
		 });
		 
		 padWearThread.start();
		 timeRemThread.start();
		 
		 padWearThread.join();
		 timeRemThread.join();
	}

}
