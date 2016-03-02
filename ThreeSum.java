package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ThreeSum {
	public static void main(String[] args) {

		ThreeSum threesum = new ThreeSum();
		int input[] = {-1,0,1,2,-1,-4};
		threesum.threeSum(input);
	}

	public void threeSum(int[] nums){
			
		List<Integer> result = new ArrayList<Integer>();
		List<List<Integer>> listOfResult = new ArrayList<List<Integer>>();
		int[] finalAnswer = new int[3];
		
		int newArray[] = new int[nums.length];
		int i=0;
		for(i=0;i<nums.length;i++){
			result.clear();
			newArray[i] = nums[i+1];
			//target = nums[i];
		}
		
		result.add(nums[i]);
		finalAnswer = twoSum(newArray,nums[i]);
		result.add(finalAnswer[0]);
		result.add(finalAnswer[1]);

		listOfResult.add(result);
	}
	
	public int[] twoSum(int a[], int target){

		int[] result = new int[2];
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0; i<a.length ;i++){
			if(hmap.containsKey(target - a[i])){
				result[0] = target - a[i];
				result[1] = target + result[0];
				break;
			}
			else{
				hmap.put(a[i], i);
			}
		}
		
		return result;
	}
}
