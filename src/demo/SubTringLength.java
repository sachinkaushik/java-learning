package demo;

import java.util.HashSet;
import java.util.Set;

public class SubTringLength {

	public static int lengthOfSubString(String s) {
		int i=0;
		int j=0;
		int max = 0;
		int len = s.length();
		
		Set<Character> set = new HashSet<>();
		char ch;
		while(i< len && j < len) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j));
				j++;
				if(!(s.charAt(j) == ch)) {
					max = Math.max(max, j-i);
				}
				
			}else {
				set.remove(s.charAt(j));
				i++;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		System.out.println(lengthOfSubString("pwwkew"));
	}
}
