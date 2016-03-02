package LeetCode;

public class InterleaveString {
	public static void main(String[] args) {
		
		InterleaveString ils = new InterleaveString();
		System.out.println(ils.interleave("aabcc", "dbbca", "aadbbcbcac"));
	}
	
	public boolean interleave(String s,String t,String toCheck){
		
		int i=0;
		int j=0;
		int k=0;
		boolean flag=false;
		
		while(k<toCheck.length()){
			flag=false;
			while(i<s.length() && s.charAt(i) == toCheck.charAt(k)){
				i++;
				k++;
				flag= true;
			}
			while(j<t.length() && t.charAt(j) == toCheck.charAt(k)){
				j++;
				k++;
				flag = true;
			}
			if(!flag){
				return false;
			}
		}		
		return true;
	}
	
	
	
	/*
	 * 
	 * 
	 * 
	 * interleave(String s, String t, String toCheck) {
	if toCheck.length != s.length + t.length then
		return false
	if toCheck.length == 0 then
		return true
	
	if s[0] == toCheck[0] && t[0] == toCheck[0] then
		firstpossibility = interleave(s[1:], t, toCheck[1:])
		secondpossibility = interleave(s, t[1:], toCheck[1:])
		return firstpossibility || secondpossibility
	else if s[0] = toCheck[0] then
		return interleave(s[1:], t, toCheck[1:])
	else if t[0] == toCeck[0] then
		return interleave(s, t[1:], toCheck[1:])
}

	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

}
