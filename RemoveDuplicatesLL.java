package LeetCode;

class LinkedListNode{
	int value;
	LinkedListNode next;

	public LinkedListNode(){
		
	}
	public LinkedListNode(int value){
		this.value = value;
	}
}

public class RemoveDuplicatesLL {
	public static void main(String[] args) {
		
		RemoveDuplicatesLL rdll = new RemoveDuplicatesLL();
		LinkedListNode l1 = new LinkedListNode(1);
		LinkedListNode l2 = new LinkedListNode(1);
		LinkedListNode l3 = new LinkedListNode(2);
		LinkedListNode l4 = new LinkedListNode(3);
		LinkedListNode l5 = new LinkedListNode(3);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		LinkedListNode head = l1;
		rdll.print(head);
		rdll.removeduplicates(head);
	}

	public void removeduplicates(LinkedListNode head){

		LinkedListNode current = head;
		LinkedListNode next = current.next;
		//check if current.value are the same
		while(current!=null){
			next = current.next;
			if(current.value == next.value){
				current.next=next.next;
			}
			current = current.next;				
		}
		print(head);
	} 

	public void print(LinkedListNode head){
		LinkedListNode current = head;
		while(current!=null){
			System.out.print(current.value+ " ");
			current = current.next;
		}
	}
}
