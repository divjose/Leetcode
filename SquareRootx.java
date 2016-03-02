package LeetCode;

public class SquareRootx {
	public static void main(String[] args) {
		SquareRootx sqx = new SquareRootx();
		System.out.println(sqx.mySqrt(225));
	}

	public int mySqrt(int x){

		if(x == 0)
			return 0;
		if(x == 1)
			return 1;
		
		int i=2;
		while(i<x/2){
			int square = i * i;
			int nextSquare = (i+1) * (i+1);
			if(square == x || (x > square && x < nextSquare))
				return i;
			i++;
		}	
		return 0;
	}
}
