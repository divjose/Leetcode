package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {

		TwoSum ts = new TwoSum();
		int[] input= {2,7,11,15};
		int target = 9;
		ts.twoSum(input, target);
	}

	public int[] twoSum(int a[], int target){

		int[] result = new int[2];
		Map<Integer,Integer> hmap = new HashMap<Integer,Integer>();
		for(int i=0; i<a.length ;i++){
			if(hmap.containsKey(target - a[i])){
				result[0] = hmap.get(target - a[i]);
				result[1] = i;
				break;
			}
			else{
				hmap.put(a[i], i);
			}
		}
		System.out.println(Arrays.toString(result));
		return result;
	}
}
