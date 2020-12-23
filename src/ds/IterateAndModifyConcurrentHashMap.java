package ds;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
 
// implementing Runnable interface
public class IterateAndModifyConcurrentHashMap implements Runnable {
 
    // creating ConcurrentHashMap object of type <Integer, String>
    static ConcurrentHashMap<Integer, String> chm = 
            new ConcurrentHashMap<Integer, String>();
 
    
    public void run() {
 
        try {
            // sleeping thread for 1000 ms
            Thread.sleep(1000);
 
            // removing entry with key=1
            String value = chm.remove(1);
            System.out.println("Entry with {key=1"
                    + " & value=" + value + "} is removed");
        }
        catch(InterruptedException iex) {
            iex.printStackTrace();
        }
        System.out.println("Removal is done... !!");
    }
 
    /**
     * main() method
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
 
        // adding key-value pairs to ConcurrentHashMap object
        chm.put(1, "google");
        chm.put(2, "youtube");
        chm.put(3, "facebook.com");
 
        // creating another thread
        Thread newThread = new Thread(
                new IterateAndModifyConcurrentHashMap());
        newThread.start();
 
        // iterating CHM object using enhanced for-loop
        for(Map.Entry<Integer, String> me : chm.entrySet()) {
 
            System.out.println("{Key=" + me.getKey() 
                    + "\t" + "Value=" + me.getValue() + "}");
 
            // sleeping thread for 2000 ms, after every turn
            Thread.sleep(2000);
        }
        System.out.println("Iterating completed... !!");
    }
}