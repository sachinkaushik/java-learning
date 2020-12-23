package collection;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {
    	
    	
         for(int i=0; i< nums.length;i++){
             for(int j=i+1; j< nums.length;j++)
                 if(nums[i]+nums[j] == target){
                	 return new int[]{i,j};
                    
                 }
         }
         throw new IllegalArgumentException("No two sum solution");
     }
    
    public static int[] twoSum1(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
     
     public static void main(String[] args){
    	 
    	 double d1 = 1.0;
     	double d2 = 1.1;
     	
     	System.out.println(d1 == d2);
     	
    	 
         int[] arr= {3,4,6,8,9};
          twoSum2(arr, 15);
     }
 }