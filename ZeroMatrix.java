package LeetCode;

public class ZeroMatrix {	

	public static void main(String[] args) {
		ZeroMatrix zm = new ZeroMatrix();
		int matrix[][]= {{1,0,0,1},{1,1,1,1},{1,1,1,1}};
		zm.zeroMatrix(matrix);
	}

	public void zeroMatrix(int matrix[][]){
		boolean row[] = new boolean[matrix.length];
		boolean col[] = new boolean[matrix[0].length];

		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]= true;
					col[j] = true;
				}
			}
		}

		for(int i=0;i<matrix.length;i++){
			if(row[i])
				for(int c=0;c< matrix[0].length ;c++)
					matrix[i][c]=0;	
		}

		for(int j=0;j<matrix[0].length;j++){
			if(col[j])
				for(int r=0;r< matrix.length ;r++)
					matrix[r][j]=0;
		}
		
		for(int i=0 ;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print("\t" +matrix[i][j]);
			}
			System.out.println();
		}
	}
}
