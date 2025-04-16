package multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class LockingSystem{
	private int i=0;
	private int j=0;
	private Lock locki;
	private Lock lockj;
	LockingSystem(Lock i,Lock j)
	{
		this.locki = i; 
		this.lockj = j;
	}
	public void incrementi() {
        locki.lock();
        try {
            i++;
        } finally {
            locki.unlock();
        }
    }

    public void incrementj() {
        lockj.lock();
        try {
            j++;
        } finally {
            lockj.unlock();
        }
    }
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}

	 
}
public class A8Locks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Lock i = new ReentrantLock();
		Lock j = new ReentrantLock();
		LockingSystem ls = new LockingSystem(i,j);
		Thread t1 = new Thread(() -> {
            for (int k = 0; k < 10000; k++) {
                ls.incrementi();
                ls.incrementj();
                
//                System.out.println(ls.getI()+" "+ls.getJ());
//                try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
            }
        });

        Thread t2 = new Thread(() -> {
            for (int k = 0; k < 10000; k++) {
                ls.incrementi();
                ls.incrementj();
//                System.out.println(ls.getI()+" "+ls.getJ());
//                try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
            }
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
		System.out.println(ls.getI()+" "+ls.getJ());
	}

}
