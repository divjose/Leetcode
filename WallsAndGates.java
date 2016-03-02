package LeetCode;

public class WallsAndGates {

	int rooms[][] = {{-2,-1,0,-2},{-2,-2,-2,-1},{-2,-1,-2,-1},{0,-1,-2,-2}};

	public static void main(String[] args) {
		WallsAndGates wg = new WallsAndGates();	
		wg.wallsAndGates();
		wg.display();
	}

	public void wallsAndGates(){
		boolean flagValuesUpdated = false;
		do{
			flagValuesUpdated = false;
			for(int i=0;i<rooms.length;i++){
				for(int j=0;j<rooms[i].length;j++){
					if(rooms[i][j] >= 0){
						flagValuesUpdated = updateDistance(i,j,rooms[i][j]) || flagValuesUpdated;
					}
				}
			}
		}while(flagValuesUpdated);
	}

	public boolean updateDistance(int row,int col,int value){
		
		boolean flagValuesUpdated = false;
		int prev_row = row -1;
		int prev_col = col -1;
		int next_row = row + 1;
		int next_col = col +1;

		if(prev_row != -1 && (rooms[prev_row][col] != 0 && rooms[prev_row][col] != -1)){
			
			if(rooms[prev_row][col] == -2){
				rooms[prev_row][col] = value+1;
				flagValuesUpdated = true;
			}
			else{
				if(Math.min(rooms[prev_row][col], value+1) != rooms[prev_row][col]){
					rooms[prev_row][col] = value+1;
					flagValuesUpdated = true;
				}
				
			}
		}

		if(prev_col != -1 && (rooms[row][prev_col] != 0 && rooms[row][prev_col] != -1)){
			
			if(rooms[row][prev_col]  == -2){
				rooms[row][prev_col]  = value+1;
				flagValuesUpdated = true;
			}
			else{
				if(Math.min(rooms[row][prev_col] , value+1) != rooms[row][prev_col]){
					rooms[row][prev_col] = value+1;
					flagValuesUpdated = true;
				}
				
			}
		}

		if(next_row < rooms.length && (rooms[next_row][col] != 0 && rooms[next_row][col] != -1)){
			
			if(rooms[next_row][col]  == -2){
				rooms[next_row][col]  = value+1;
				flagValuesUpdated = true;
			}
			else{
				if(Math.min(rooms[next_row][col] , value+1) != rooms[next_row][col]){
					rooms[next_row][col] = value+1;
					flagValuesUpdated = true;
				}
			}
		}

		if(next_col < rooms[row].length && (rooms[row][next_col] != 0 && rooms[row][next_col] != -1)){
			if(rooms[row][next_col]  == -2){
				rooms[row][next_col] = value+1;
				flagValuesUpdated = true;
			}
			else{
				if(Math.min(rooms[row][next_col] , value+1) != rooms[row][next_col]){
					rooms[row][next_col] = value+1;
					flagValuesUpdated = true;
				}
			}
		
		}
		return flagValuesUpdated;
	}

	public void display(){
		for(int i=0;i<rooms.length ;i++){
			for(int j=0 ;j<rooms[0].length;j++){
				System.out.print("\t" + rooms[i][j]);
			}
			System.out.println();
		}
	}
}

//http://buttercola.blogspot.com/2015/09/leetcode-walls-and-gates.html
