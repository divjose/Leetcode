package LeetCode;

import java.util.Scanner;

public class RotateMatrix {

	int matrix[][];
	int newMatrix[][] = new int[4][4];
	static int row = 4;
	static int column =4;
	Scanner scan;

	public static void main(String arg[]){

		RotateMatrix rm = new RotateMatrix();
		int matrixCreated[][]={{1,2,3,4},{2,3,4,5},{3,4,5,6},{4,5,6,7}};
		rm.newMatrix = rm.rotate(matrixCreated,4,4);
		rm.display();

	}


	void display() {		
		System.out.println("\nThe Matrix is :");		
		for(int i=0; i<row; i++) {			
			for(int j=0; j<column; j++) {				
				System.out.print("\t" + newMatrix[i][j]);
			}
			System.out.println();
		}
	}



	public int[][] rotate(int[][] matrix,int r,int c) {

		int rnew=0;
		int cnew=c-1;

		for(int i=0 ;i<r;i++){
			rnew = 0;
			for(int j=0 ; j<c; j++){
				newMatrix[rnew][cnew]=matrix[i][j];
				rnew++;
			} 
			cnew--;
		}
		return newMatrix;
	}
}

