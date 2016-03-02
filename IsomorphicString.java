package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public static void main(String[] args) {

		IsomorphicString is = new IsomorphicString();
		System.out.println(is.isomorphic("egg", "add"));
		System.out.println(is.isomorphic("foo", "bar"));
		System.out.println(is.isomorphic("title", "paper"));
	}

	public boolean isomorphic(String s,String t){

		Map<Character,Character> map = new HashMap<Character,Character>();

		if(s.length() != t.length()){
			return false;
		}
		
		int i=0;
		while(i<s.length()){
			if(!map.containsKey(s.charAt(i))){
				map.put(s.charAt(i), t.charAt(i));
			}
			else{
				if(map.get(s.charAt(i))!= t.charAt(i))
					return false;
			}
			i++;
		}
		return true;
	}
}
