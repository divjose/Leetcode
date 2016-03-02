package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class StrStr {
	public static void main(String args[]){

		StrStr ss = new StrStr();
		System.out.println(ss.strStr("Divvvya","vvy"));
	}

	public int strStr(String haystack,String needle){
		char[] haystackarray = haystack.toCharArray();
		char[] needlearray = needle.toCharArray();
		
		for(int i=0;i<haystackarray.length - needlearray.length;i++){
			int tempneedlei=0;
			int temphaystacki=i;
			while(tempneedlei < needlearray.length && needlearray[tempneedlei] == haystackarray[temphaystacki]){
				tempneedlei++;
				temphaystacki++;
			}
			if(tempneedlei == needlearray.length){
				return i;
			}
		}
		return -1;
	}
}
