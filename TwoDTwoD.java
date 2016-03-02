package LeetCode;

public class TwoDTwoD {
	public static void main(String arg[]){
	
		TwoDTwoD td = new TwoDTwoD();
		int[][] mat={{7,2,8,3,4,5,5,8,6,4}, 
					 {6,7,3,1,1,5,8,6,1,9}, 
					 {8,9,8,8,2,4,2,6,4,3}, 
					 {3,8,3,9,5,0,5,3,2,4}, 
					 {9,5,0,9,5,0,5,8,1,3}, 
					 {3,8,4,3,8,4,5,3,8,4}, 
					 {6,4,7,3,5,3,0,2,9,3}, 
					 {7,0,5,3,1,0,6,6,0,1}, 
					 {0,8,3,4,2,8,2,9,5,6}, 
					 {4,6,0,7,9,2,4,1,3,7}
					};
		
		td.find2d(mat,10,10);
	}
	
	public int[][] find2d(int[][] matrix,int r,int c){
		
		int row = r;
		int col =c;
		
		int submat[][] = {{9,5,0}, 
							{3,8,4}, 
							{3,5,3}
							};
		
		int sr = submat[0].length;
		int sc = sr;
		int si=0;
		int sj=0;
		
		
		for(int i=0;i<r-sr;i++){
			for(int j=0;j<c-sc;j++){
				for(;matrix[i][j]== submat[si][sj] && sj < sr;j++,sj++){
						
					}
				i++;
				
					
				
		}
	}
		return submat;
}

}