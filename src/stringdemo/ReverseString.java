package stringdemo;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * @author A1001371
 *
 */
/**
 * @author A1001371
 *
 */
public class ReverseString {

	public void methodTest(Object object) {
		System.out.println("Calling object method");
	}
	public void methodTest(String object) {
		System.out.println("Calling String method");
	}

	int doSum(int a, int b) {
		return 0;
	}

	double doSum(int a, int b, int c) {
		return 0.0;
	}

	public static void main(String[] args) {
		
		/*
		 * ArrayList<String> al = new ArrayList<>(); System.out.println(al.size());
		 * al.add("a"); al.add("b"); al.add("c"); al.add(1, "d");
		 * 
		 * System.out.println(al.size()); al.remove("a"); al.remove(2);
		 * 
		 * System.out.println(al.size());
		 * 
		 * String ss = "10300L+01-END";
		 * 
		 * System.out.println(ss.substring(0, 5)); System.out.println(ss.substring(5,
		 * 9)); System.out.println(ss.substring(9, 13));
		 * 
		 * 
		 * System.out.println(LocalDateTime.now()); ReverseString rr = new
		 * ReverseString(); rr.methodTest(null);
		 */
		String command = "LT|HRS_IMPUTE_TBL|Translates Employment Status to Imputeable Status based on Plan ID|ACTIVE|String||BENE|String||MILNOP|String||DEATHI|String||DEATHO|String||DEATHR|String||DISABL|String||DISABS|String||DIVTFR|String||LOAFM|String||MILPAY|String||LOANP|String||LOAWP|String||QDRO|String||RETIRE|String||RETIRU|String||SEVER|String||TERM|String||TERMIV|String||WKCOMP|String||false|HRS_IMPUTE_CMP";

		String[] arr = command.split("\\|");
		
		try {
			System.out.println(arr[arr.length-1]);
			Boolean.parseBoolean(arr[arr.length-1]);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		/*
		 * IntStream.range(3, arr.length - 4).forEach(i -> { System.out.println(arr[i]);
		 * });
		 */
		/*
		 * int j=1; for (int i=2; i<arr.length;i++) { if(j%2 == 0) {
		 * System.out.println(" indx = "+arr[i] + " , indxname " + arr[i+1]); }else {
		 * System.out.println(" val = "+arr[i] + " , valname " + arr[i+1]); } i++;j++; }
		 * 
		 * IntStream.range(2, arr.length - 3).forEach(i -> { System.out.println(" 1 = "
		 * + arr[i]); });
		 * 
		 * 
		 * System.out.println(st);
		 * 
		 * int j = 1; for (int i = 2; i < st.length; i++) { if (j == 1) {
		 * System.out.println(" 1 = " + st[i]); } else if (j == 2) {
		 * System.out.println(" 2 = " + st[i]); } else if (j == 3) {
		 * System.out.println(" 3 = " + st[i]); j = 0; } j++; }
		 * 
		 * // int jj = 1;
		 * 
		 * System.out.println("==============================================");
		 * AtomicInteger jj = new AtomicInteger(1); IntStream.range(3, st.length -
		 * 2).forEach(i -> { if (jj.get() == 1) { System.out.println(" 1 = " + st[i]); }
		 * else if (jj.get() == 2) { System.out.println(" 2 = " + st[i]); } else if
		 * (jj.get() == 3) { System.out.println(" 3 = " + st[i]); jj.set(0); }
		 * jj.getAndIncrement(); });
		 * 
		 * System.out.println("------------" + st[st.length - 2]);
		 * 
		 * for (int i = 0; i < 10; i++) { if (i % 2 == 0) { System.out.println("even");
		 * } else { System.out.println("odd"); } }
		 * 
		 * command = command.replaceAll("\"", ""); System.out.println(command);
		 * 
		 * List<Integer> l1 = new ArrayList<>();
		 * 
		 * l1.add(1); l1.add(2); l1.add(3); l1.add(4); l1.add(5); l1.add(6); l1.add(7);
		 * 
		 * 
		 * List<Integer> l2 = new ArrayList<>(); l2.add(1); l2.add(2); l2.add(3);
		 * l2.add(4);
		 * 
		 * l1.removeAll(l2); System.out.println(l1);
		 * 
		 * 
		 * System.out.println(Math.floorDiv(50, 2));
		 * 
		 * BigDecimal bd = new BigDecimal("0.00001");
		 * 
		 * 
		 * 
		 * double dd = 0.00001;
		 * 
		 * 
		 * System.out.println("=======dd============"+dd);
		 * 
		 * 
		 * 
		 * Double l1 = 1.0E-5;
		 * 
		 * DecimalFormat df = new DecimalFormat("#.#"); df.setMaximumFractionDigits(5);
		 * String str = df.format(l1); System.out.println("==========format==="+str);
		 * System.out.println("==========format==="+Double.parseDouble(str));
		 * 
		 * System.out.println("=========l1========="+l1.toString());
		 */

	}

	public static String getCurrentTime(String pattern) {
		LocalDateTime date = LocalDateTime.now(ZoneId.of("America/Chicago"));
		return date.format(DateTimeFormatter.ofPattern(pattern));
	}
}
