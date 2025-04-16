package multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableClass implements Callable<String>{
	private String name;
	CallableClass(String name)
	{
		this.name = name;
	}
	@Override
	public String call() throws Exception {
		return name;
	}
	
}

public class B1ExecutorFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService ex = Executors.newFixedThreadPool(1);
		Future<String> future=ex.submit(new CallableClass("Samba"));
		System.out.println(future.get());
		System.out.println("Main method");
		ex.shutdown();
	}

}
