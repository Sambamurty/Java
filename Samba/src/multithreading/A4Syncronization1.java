package multithreading;


public class A4Syncronization1 {
	public static void main(String[] args) throws InterruptedException {
		Counter counter = new Counter(); 
		// Create threads to increment the counter 
		Thread incrementThread1 = new Thread(() -> { 
			for (int i = 0; i < 5; i++) 
			{   
				counter.increment(); 
				try {
					Thread.sleep(100); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		});
		Thread incrementThread2 = new Thread(() -> { 
			for (int i = 0; i < 5; i++) { 
				counter.increment(); 
				try { 
					Thread.sleep(100); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				} 
			} 
		});
		Thread decrementThread1 = new Thread(() -> { 
			for (int i = 0; i < 5; i++) { 
				counter.decrement(); 
				try { 
					Thread.sleep(100); 
				} catch (InterruptedException e) { 
					e.printStackTrace(); 
				}
			} 
		});
		Thread decrementThread2 = new Thread(){
			public void run()
			{
				for (int i = 0; i < 5; i++) { 
					counter.decrement(); 
					try { 
						Thread.sleep(100); 
					} catch (InterruptedException e) { 
						e.printStackTrace(); 
					} 
				}
			}
		};
		// Start the threads 
		incrementThread1.start(); //incrementThread1.join();
		incrementThread2.start(); //incrementThread2.join();
		decrementThread1.start(); //decrementThread1.join();
		decrementThread2.start(); //decrementThread2.join();
		// Wait for the threads to finish 
		try { 
			incrementThread1.join(); 
			incrementThread2.join(); 
			decrementThread1.join(); 
			decrementThread2.join(); 
			} catch (InterruptedException e) { e.printStackTrace(); } 
		// Display the final count 
		System.out.println("Final Count: " + counter.getCount()); }
}
