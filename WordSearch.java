package LeetCode;

public class WordSearch {
	
	char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
	boolean flag[][] = new boolean[board.length][board[0].length];
	
	public static void main(String[] args) {
		WordSearch ws = new WordSearch();
		
		String word = "ABCB";
		System.out.println(ws.exist(word));

	}

	public boolean exist(String word){

		char c =word.charAt(0);		
		int foundAt[] = {-1,-1};
		boolean first_char_found = false;
		int rr=0;
		int cc=0;
		
		for(int row=0; row<board.length ;row++){
			for(int col=0; col<board[0].length ;col++){
				flag[row][col] = false;
			}
		}		

		for(int row=0; row<board.length ;row++){
			for(int col=0; col<board[0].length ;col++){
				if(c == board[row][col]){
					flag[row][col] = true;
					first_char_found = true;
					rr=row;
					cc=col;
					break;
				}
			}
			if(first_char_found)
				break;
		}
		
		for(int i=1;i<word.length();i++){
			c = word.charAt(i);
			foundAt = check(c, rr , cc);
			if(foundAt[0]== -1 && foundAt[1] == -1){
				return false;
			}
			else{
				rr = foundAt[0];
				cc = foundAt[1];
			}
		}		
		return true;
	}	
	
	public int[] check(char c,int row , int col){
		int prev_row = row - 1;
		int prev_col = col- 1;
		int next_row = row + 1;
		int next_col = col +1;
		int foundAt[] = {-1,-1};
		
		if(prev_row >= 0){
			if(c == board[prev_row][col] && flag[prev_row][col]==false ){
				flag[prev_row][col] = true;
				foundAt[0] = prev_row;
				foundAt[1] = col;
				return foundAt ;
			}
		}
		
		if(next_col < board[row].length){
			if(c == board[row][next_col] && flag[row][next_col]==false ){
				flag[row][next_col] = true;
				foundAt[0] = row;
				foundAt[1] = next_col;
				return foundAt ;
			}
		}
		
		if(next_row < board.length){
			if(c == board[next_row][col] && flag[next_row][col]==false ){
				flag[next_row][col] = true;
				foundAt[0] = next_row;
				foundAt[1] = col;
				return foundAt ;
			}
		}
		
		if(prev_col >= 0){
			if(c == board[row][prev_col] && flag[row][prev_col]==false ){
				flag[row][prev_col] = true;
				foundAt[0] = row;
				foundAt[1] = prev_col;
				return foundAt ;
			}
		}	
		
		return foundAt;
	}
}

