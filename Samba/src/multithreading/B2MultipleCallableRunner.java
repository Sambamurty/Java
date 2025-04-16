package multithreading;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class B2MultipleCallableRunner {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		ExecutorService exe = Executors.newFixedThreadPool(5);
		List<CallableClass> tasks = List.of(new CallableClass("Samba"),
											new CallableClass("Sanjay"),
											new CallableClass("Kumari"),
											new CallableClass("Srinu")
											);
		List<Future<String>> results = exe.invokeAll(tasks);
		for(Future<String> res:results)
		{
			System.out.println(res.get());
		}
		String resultAny = exe.invokeAny(tasks);
		System.out.println(resultAny);
		exe.shutdown();
	}

}
