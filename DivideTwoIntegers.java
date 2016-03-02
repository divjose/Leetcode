package LeetCode;

public class DivideTwoIntegers {
	public static void main(String args[]){
		
		DivideTwoIntegers dti = new DivideTwoIntegers();
		System.out.println(dti.divide(6,7));
	}
	
	public int divide(int dividend, int divisor){
		int larger =  dividend;
		int smaller = divisor;
		int count =0;
		while(larger >= smaller ){
			larger = larger - smaller;
			count++;
		}
		return count;
	}
}
