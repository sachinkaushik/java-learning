package ds;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class HelloWorldApp {
	public static void main(String... args) throws InterruptedException,
			ExecutionException, TimeoutException {

		// ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService es = Executors.newFixedThreadPool(3);
		FactorialCalculator fact = new FactorialCalculator(10);
		FactorialCalculator fact1 = new FactorialCalculator(15);
		FactorialCalculator fact2 = new FactorialCalculator(30);
		System.out.println("submitted callable task to calculate factorial of 10");
		Future result10 = es.submit(fact);
		System.out.println("submitted callable task to calculate factorial of 15");
		Future result15 = es.submit(fact1);
		System.out
				.println("submitted callable task to calculate factorial of 20");
		Future result20 = es.submit(fact1);
		System.out
				.println("Calling get method of Future to fetch result of factorial 10");
		// long factorialof10 = result10.get();
		System.out.println("factorial of 10 is : " + result10.get());
		System.out
				.println("Calling get method of Future to get result of factorial 15");
		// long factorialof15 = result15.get();
		System.out.println("factorial of 15 is : " + result15.get());
		System.out
				.println("Calling get method of Future to get result of factorial 20");
		// result20.get();
		System.out.println("factorial of 30 is : "
				+ result20.get(1, TimeUnit.NANOSECONDS));

		ExecutorService es1 = Executors.newFixedThreadPool(2);
		SumNum sn = new SumNum(1, 10);
		SumNum sn1 = new SumNum(1, 10);
		SumNum sn2 = new SumNum(16, 20);
		SumNum sn3 = new SumNum(21, 25);
		SumNum sn4 = new SumNum(26, 30);
		Future<Integer> result1 = es.submit(sn);
		Future<Integer> result2 = es.submit(sn1);
		Future<Integer> result3 = es.submit(sn2);
		Future<Integer> result4 = es.submit(sn3);
		Future<Integer> result5 = es.submit(sn4);
		Integer res = result1.get() + result2.get();
		Set set = new HashSet();
		
		
		

		System.out.println("Total Sum==" + res + "Thread Name"
				+ Thread.currentThread()+":"+sn.equals(sn1));
	}
}

class FactorialCalculator implements Callable<Long> {
	private int number;

	public FactorialCalculator(int number) {
		this.number = number;
	}

	// @Override
	public Long call() throws Exception {
		return factorial(number);
	}

	private long factorial(int n) throws InterruptedException {
		long result = 1;
		while (n != 0) {
			result = n * result;
			n = n - 1;
			Thread.sleep(100);
		}
		return result;
	}
}

class SumNum implements Callable<Integer> {
	private int a, b = 0;

	public SumNum(int a, int b) {
		this.a = a;
		this.b = b;
		Thread.currentThread().setName("Thread" + a);
	}

	public Integer call() throws Exception {
		
		return add(a, b);
	}

	private int add(int a, int b) {
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("sum=" + sum + ":thread" + Thread.currentThread());
		return sum;
	}

}
