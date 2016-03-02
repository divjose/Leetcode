package LeetCode;

import java.util.List;
import java.util.ArrayList;

public class PeekingIterator {

	int counter =0;
	int peekCounter=0;
	static List<Integer> p = new ArrayList<Integer>();

	public static void main(String[] args) {
		PeekingIterator pi = new PeekingIterator();

		p.add(1);
		p.add(2);
		p.add(3);
		p.add(4);
		p.add(5);
		p.add(6);
		
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Peek" + "  "+ pi.peek());
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Has next" + "  "+ pi.hasNext());
		System.out.println("Next" + "  "+ pi.next());
		System.out.println("Next" + "  "+ pi.peek());
		
		
	}

	public Integer next(){
		if(hasNext()){
			peekCounter++;
			return(p.get(counter++));
		}
		
		return -1;
	}

	public Integer peek(){
		if(peekCounter < p.size())
			return (p.get(peekCounter++));
		return -1;
	}
	
	public boolean hasNext(){
		if(counter < p.size())
			return true;

		return false;
	}
	
	

}
