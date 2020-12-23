package collection;

import java.util.HashMap;
import java.util.Map;

public class LenghtOfString {

	public static int findSubStringLenght(String s) {
		int lenght = 0;
		String str="";
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}else {
				i = map.get(ch);
				map.clear();
			}
			
			if(map.size() > lenght) {
				lenght = map.size();
				str = map.keySet().toString();
			}
		}
		return lenght;
	}
	
	public static void main(String[] args) {
		System.out.println(findSubStringLenght("pwwkewa"));
	}
}
