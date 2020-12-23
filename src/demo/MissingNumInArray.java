package demo;

public class MissingNumInArray {

	public static void main(String[] args) {
		int n =  10;
		int sum = sumOfNum(n);
		
		int[] elemetns = {2,4,6,7,8,9};
		int sumOfElemetn = sumOfNum(elemetns);
		
		int missingNum = sum- sumOfElemetn;
		System.out.println(missingNum);
	}
	
	static int sumOfNum(int n) {
		int sum = (n*(n+1))/2;
		return sum;
	}
	
	static int sumOfNum(int n[]) {
		int sum=0;
		for(int i=0;i<n.length-1;i++) {
			sum=sum+n[i];
		}
		return sum;
	}
}
