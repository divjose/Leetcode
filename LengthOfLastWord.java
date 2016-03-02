package LeetCode;

public class LengthOfLastWord {
	public static void main(String[] args) {
		LengthOfLastWord lw = new LengthOfLastWord();
		System.out.println(lw.lengthOfWord("Announcement in Job Postings Group"));
	}

	public int lengthOfWord(String S){
		
		String[] words = S.split(" ");
		
		if(words.length <= 1){
			return 0;
		}

		int lastWordIndex = words.length-1;
		String lastWord =  words[lastWordIndex];
		int lengthOfLastWord = lastWord.length();		
		return lengthOfLastWord;

	}
}
