package LeetCode;


public class InsertionSortLL {
	public static void main(String[] args) {

		InsertionSortLL isll = new InsertionSortLL();  
		LinkedListNode l1 = new LinkedListNode(3);
		LinkedListNode l2 = new LinkedListNode(7);
		LinkedListNode l3 = new LinkedListNode(4);
		LinkedListNode l4 = new LinkedListNode(9);
		LinkedListNode l5 = new LinkedListNode(5);
		LinkedListNode l6 = new LinkedListNode(2);
		LinkedListNode l7 = new LinkedListNode(6);
		LinkedListNode l8 = new LinkedListNode(1);
		LinkedListNode head = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = l6;
		l6.next = l7;
		l7.next = l8;
		l8.next = null;

		isll.insertionsortll(head);
	}

	public void insertionsortll(LinkedListNode head){

		LinkedListNode newHead = new LinkedListNode(0);
		LinkedListNode pointerj = head;
		LinkedListNode pointeri = head.next;

		
		//3->7->9->4->5--||
		//j- i- i- i
		//3- 4 - 
		if(pointeri.value < pointerj.value){
			LinkedListNode temp = pointeri;
			//take j's value and put in a new linkedlist
			newHead=pointerj;
			if(temp.value < pointerj.value){
				newHead.next = temp;
				
			}
		}
	}

	public void print(LinkedListNode head){
		LinkedListNode current = head;
		while(current!=null){
			System.out.print(current.value+ " ");
			current = current.next;
		}
	}
}
