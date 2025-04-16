package multithreading;

public class DeadLock {

	    static final Object lock1 = new Object();
	    static final Object lock2 = new Object();

	    public static void main(String[] args) {
	        Thread thread1 = new Thread(() -> {
	            try {
					acquireLocksInOrder(lock1, lock2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  // Always acquire lock1 before lock2
	        });

	        Thread thread2 = new Thread(() -> {
	            try {
					acquireLocksInOrder1(lock1, lock2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}  // Always acquire lock1 before lock2
	        });

	        thread1.start();
	        thread2.start();
	    }

	    static void acquireLocksInOrder(Object firstLock, Object secondLock) throws InterruptedException {
	        synchronized (firstLock) {
	            System.out.println(Thread.currentThread().getName() + ": Holding " + firstLock);
	            Thread.sleep(10);

	            synchronized (secondLock) {
	                System.out.println(Thread.currentThread().getName() + ": Holding " + secondLock);
	                // Perform operations requiring both locks here
	            }
	            System.out.println(Thread.currentThread().getName() + ": Released " + secondLock);
	        }
	        System.out.println(Thread.currentThread().getName() + ": Released " + firstLock);
	    }
	    static void acquireLocksInOrder1(Object firstLock, Object secondLock) throws InterruptedException {
	        synchronized (secondLock) {
	            System.out.println(Thread.currentThread().getName() + ": Holding " + secondLock);
	            Thread.sleep(10);

	            synchronized (firstLock) {
	                System.out.println(Thread.currentThread().getName() + ": Holding " + firstLock);
	                // Perform operations requiring both locks here
	            }
	            System.out.println(Thread.currentThread().getName() + ": Released " + secondLock);
	        }
	        System.out.println(Thread.currentThread().getName() + ": Released " + firstLock);
	    }
}
