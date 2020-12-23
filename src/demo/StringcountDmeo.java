package demo;

import java.util.HashMap;
import java.util.Map;

public class StringcountDmeo {

	public static void main(String[] args) {
		
		String  str = count("abcabdd");
		System.out.println(str);
	}
	public static String count(String str) {
		char[] arr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for(char ch : arr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
		}
		StringBuilder sb = new StringBuilder();
		for(Map.Entry<Character, Integer> me : map.entrySet()) {
			sb.append(me.getKey()).append(me.getValue());
		}
		return sb.toString();
	}

}
