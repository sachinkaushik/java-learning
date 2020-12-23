package collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LengthOfLongestSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character
		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	static String getUniqueCharacterSubstringBruteForce(String input) {
		String output = "";
		for (int start = 0; start < input.length(); start++) {
			Set<Character> visited = new HashSet<>();
			int end = start;
			for (; end < input.length(); end++) {
				char currChar = input.charAt(end);
				if (visited.contains(currChar)) {
					break;
				} else {
					visited.add(currChar);
				}
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end);
			}
		}
		return output;
	}

	static void longestSubstring(String inputString) {
		char[] arr1 = inputString.toCharArray();
		String long_str = null;
		int str_length = 0;
		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr1.length; i++) {
			char ch = arr1[i];
			if (!charPosMap.containsKey(ch)) {
				charPosMap.put(ch, i);
			} else {
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			if (charPosMap.size() > str_length) {
				str_length = charPosMap.size();
				long_str = charPosMap.keySet().toString();
			}
		}
		System.out.println("Input String : " + inputString);
		System.out.println("The longest substring : " + long_str);
		System.out.println("The longest Substring Length : " + str_length);
	}

	public static void main(String[] args) {
		longestSubstring("pwwkew");
	}
}
