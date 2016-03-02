package LeetCode;
import java.util.*;

class MinStack {
	public static void main(String arg[]){
		MinStack minstack = new MinStack();
		minstack.push(2);
		minstack.push(0);
		minstack.push(3);
		minstack.push(0);
		System.out.println(minstack.getMin());
		minstack.pop();
		System.out.println(minstack.getMin());
		minstack.pop();
		System.out.println(minstack.getMin());
		minstack.pop();
		System.out.println(minstack.getMin());

	}
	List<Integer> stackArray = new ArrayList<Integer>();
	int top = -1;
	int min=0;
	public void push(int x) {
		if(stackArray.isEmpty()){
			min=x;
		}
		else{
			if(x<min)
				min = x;
		}
		stackArray.add(x);
		top++;        
	}
	public void pop() {		
		stackArray.remove(top);
		top--;
	}
	public int top() {
		return stackArray.get(top);
	}
	public int getMin() {
		if(!stackArray.contains(min))
			min = this.minHeapify();
		return min;
	}
	public int minHeapify(){
		int k = stackArray.size();
		for(int i=((k/2) -1 ) ; i >= 0 ; i--){
			int parentIndex = i;
			int leftChild = parentIndex *2;
			int rightChild = (parentIndex*2) +1 ;
 
			if((rightChild <k) && (stackArray.get(leftChild) < stackArray.get(rightChild))){
				int temp = stackArray.get(parentIndex);
				stackArray.set(parentIndex, stackArray.get(leftChild));
				stackArray.set(leftChild, temp);
			}
			else if((rightChild <k) && (stackArray.get(leftChild) > stackArray.get(rightChild))){
				int temp = stackArray.get(parentIndex);
				stackArray.set(parentIndex, stackArray.get(rightChild));
				stackArray.set(rightChild, temp);
			}
		}
		
		if(stackArray.size()>0)
			return stackArray.get(0);
		else
			return -1;
	}
}