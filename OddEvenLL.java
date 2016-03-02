package LeetCode;

public class OddEvenLL {
	public static void main(String[] args) {
		OddEvenLL oel = new OddEvenLL();
		LinkedListNode l1 = new LinkedListNode(1);
		LinkedListNode l2 = new LinkedListNode(2);
		LinkedListNode l3 = new LinkedListNode(3);
		LinkedListNode l4 = new LinkedListNode(4);
		LinkedListNode l5 = new LinkedListNode(5);
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l5;
		l5.next = null;
		LinkedListNode head = l1;
		oel.oddEvenList(head);
	}

	public void oddEvenList(LinkedListNode head) {

		LinkedListNode current = head;
		LinkedListNode next = current.next;
		LinkedListNode even1 = head.next;
		
		while(next!=null){
			current.next = next.next;
			current = next;
			next = current.next;
		}		
		current.next = even1;
		
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