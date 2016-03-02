package LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class ReversePolishNotation {
	public static void main(String[] args) {
		ReversePolishNotation rpn = new ReversePolishNotation();
		String[] tokens = {"2", "1", "+", "3", "*"};
		String[] tokens2 = {"0", "3", "/"};
		//rpn.evalRPN(tokens);
		rpn.evalRPN(tokens2);	
	}

	public int evalRPN(String[] tokens) {

		Stack<Integer> stack = new Stack<Integer>();
		int i=0;
		int result=0;
		int op1 = 0;
		int op2 = 0;

		while(i < tokens.length){

			if(tokens[i] != "+" && tokens[i] !=  "-" && tokens[i] != "*" && tokens[i] != "/" ){
				stack.push(Integer.parseInt(tokens[i]));
			}			else{
				op1 = stack.pop();
				op2 = stack.pop();

				switch(tokens[i]){
				case "*" : result = op2 * op1;
						   break;
				case "/" : result = op2 / op1;
							break;
				case "-" : result = op2 - op1;
							break;
				case "+" : result = op2 + op1;
							break;
				}
				stack.push(result);
			}
			i++;
		}

		return stack.pop();
	}
}
