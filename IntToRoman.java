package LeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntToRoman {

	static LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();

	public static void main(String arg[]){
		IntToRoman ir = new IntToRoman();	

		map.put(1000, "M");
		map.put(900, "CM");
		map.put(500, "D");
		map.put(400, "CD");
		map.put(100, "C");
		map.put(90, "XC");
		map.put(50, "L");
		map.put(40, "XL");
		map.put(10, "X");
		map.put(9, "IX");
		map.put(5, "V");
		map.put(4, "IV");
		map.put(1, "I");

		System.out.println(ir.intToRoman(5340));		
	}

	public String intToRoman(int num){
		StringBuilder roman = new StringBuilder();

		for(Map.Entry<Integer,String> e: map.entrySet()){
			while(num >= e.getKey()){
				num = num - e.getKey();
				roman.append(e.getValue());
			}
		}
		return roman.toString();
	}
}
