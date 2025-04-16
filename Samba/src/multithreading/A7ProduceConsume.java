package multithreading;

class P{
	Integer num;
	public synchronized void put(Integer num) throws InterruptedException
	{
		
		if(this.num != null){
			wait();
		}
		this.num = num;
		System.out.println("Put : "+num);
		//Thread.sleep(1000);
		notifyAll();
	}
	public synchronized void get() throws InterruptedException {
		if(num == null) {
			wait();
		}	
		System.out.println("Get : "+num);
		//Thread.sleep(1000);
		num = null;
		notifyAll();
	}
}
class Produce implements Runnable{
	P p;
	Produce(P p)
	{
		this.p = p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Integer i=0;
		while(i<11)
		{
			try {
				p.put(i++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Consume implements Runnable{

	P p;
	Consume(P p){
		this.p = p;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true)
		{
			try {
				Thread.sleep(1000);
				p.get();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class A7ProduceConsume {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		P p = new P();
		Consume cus = new Consume(p);
		Produce pro = new Produce(p);
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(cus);
		t2.start();
		t1.start();
		t1.join();
		t2.join();
		t1.stop();
		t2.stop();
	}

}
