package ds;
public class SimulateOutOfMemoryError extends Object {

	public static void main(String[] args) throws Exception {
		System.out.println(Runtime.getRuntime().freeMemory());
		int dummyArraySize = 15;
		String s1="";
		System.out.println("Max JVM memory: " + Runtime.getRuntime().maxMemory());
		long memoryConsumed = 0;
		long[] memoryAllocated = null;
		try {
				
			for (int loop = 0; loop < 5; loop++) {
				memoryAllocated = new long[dummyArraySize];
				memoryAllocated[0] = 0;
				memoryConsumed += dummyArraySize * Long.SIZE;
				System.out.println("Memory Consumed till now: " + memoryConsumed);
				dummyArraySize *= dummyArraySize * 2;
				Thread.sleep(500);
				
			} 
		} catch (OutOfMemoryError outofMemory) {
			System.out.println("Catching out of memory error");
		 //  memoryAllocated = null;
			//Log the information,so that we can generate the statistics (latter on).
			//throw outofMemory;
		   
		}System.out.println("Hiiiiii");
		
		
	}

}