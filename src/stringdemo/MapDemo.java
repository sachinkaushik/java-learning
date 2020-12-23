package stringdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map =new HashMap<>();
		map.put(1, "a");
		map.put(1, map.get(1)+"b");
		
		
		String s = "PCAL | PENSCALC | Pension Calculation | true | TCR_RSLT | TCR_SVC | TCR_ATRB | TCR_HRS | TCR_ELEC";
		String[] sArr = s.trim().split("\\|");
		Stream.of(sArr).forEach(System.out::println);
		
		String s4 = s.trim().index
		//System.out.println(s.trim().split(" "));
	}

}
