package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twoSumForThreeSum {
	public static void main(String[] args) {

		twoSumForThreeSum ts = new twoSumForThreeSum();
		int[] input= {0,1,2,-1,-4};
		int negate = -1;
		int target = (-1 * negate);
		ts.twoSumThreeSum(input, target);
	}

	public ArrayList<ArrayList<Integer>> twoSumThreeSum(int a[], int target){

		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		ArrayList<Integer> oneTriplet = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> allTriplet = new  ArrayList<ArrayList<Integer>>();
		
		for(int i=0; i<a.length ;i++){
			oneTriplet.clear();
			if(hmap.containsKey(target - a[i])){
				oneTriplet.add(target - a[i]);
				oneTriplet.add(target + oneTriplet.get(0));
				allTriplet.add(oneTriplet);
			}
			else{
				hmap.put(a[i], i);
			}
		}
		
		for(int i = 0; i < allTriplet.size(); i++) {   
		    System.out.print(allTriplet.get(i));
		}  
		return allTriplet;
	}
}
