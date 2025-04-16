package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Runn extends Thread{
	private int threadNumber;
	public Runn(int i) {
		threadNumber = i;
	}
	public void run()
	{
		System.out.print("Thread-"+threadNumber+"-Started");
		for(int i=0;i<30;i++)
		{
			if(i%10==0)
				System.out.println();
			System.out.print(i+" ");
		}
		System.out.print("Thread-"+threadNumber+"-ended.");
	}
}
public class A5ExecutorService {

	public static void main(String[] args) {
		ExecutorService exe = Executors.newFixedThreadPool(2);
		for(int i=0;i<10;i++)
		{
			exe.execute(new Runn(i));
		}
		exe.shutdown();
	}
	

}
