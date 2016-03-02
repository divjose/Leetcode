package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

public class ProductOfArrayExpectSelf {
	public static void main(String[] args) {
		ProductOfArrayExpectSelf productArray = new ProductOfArrayExpectSelf();
		int input[] = {1,2,3,4};
		productArray.productExpectSelf(input);
	}

	public void productExpectSelf(int a[]){

		int result[] = new int[a.length];		
		int increasingLoop[] = new int[a.length];
		int decreasingLoop[] = new int[a.length];
		increasingLoop[0] = 1;
		decreasingLoop[a.length - 1] = 1;
		
		for(int i=0 ;i<a.length-1;i++){
			increasingLoop[i+1] = a[i] * increasingLoop[i] ;
		}
			
		for(int j=a.length-1;j>0;j--){
			decreasingLoop[j-1] = a[j] * decreasingLoop[j] ;
		}
		
		for(int k=0 ; k<a.length ;k++){
			result[k] = increasingLoop[k] * decreasingLoop[k] ;
		}
		
		System.out.println(Arrays.toString(result));
	}
}
