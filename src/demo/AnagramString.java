package demo;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println("Enter two String");
		
		Scanner in  = new Scanner(System.in);
		String str1 = in.nextLine();
		String str2 = in.nextLine();
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		String s1 = new String(arr1);
		String s2 = new String(arr2);
		if(s1.equals(s2)) {
			System.out.println("String is anagram");
		}else {
			System.out.println("String is not anagram");
		}
		in.close();
	}
}
