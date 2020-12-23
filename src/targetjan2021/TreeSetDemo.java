package targetjan2021;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		 TreeSet<String> treeSet = new TreeSet<>(); 
		  
	        treeSet.add("geeks"); 
	        treeSet.add("for"); 
	        treeSet.add("geeks"); 
	        treeSet.add("geeksforGeeks"); 
	  
	        for (String temp : treeSet) 
	            System.out.printf(temp + " "); 
	  
	        System.out.println("\n"); 

	}

}
