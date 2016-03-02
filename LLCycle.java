package LeetCode;


public class LLCycle {
	public static void main(String args[]){

		LLCycle llc = new LLCycle();
		LinkedListNode l1 = new LinkedListNode(1);
		LinkedListNode l2 = new LinkedListNode(2);
		LinkedListNode l3 = new LinkedListNode(3);
		LinkedListNode l4 = new LinkedListNode(4);
		LinkedListNode l5 = new LinkedListNode(5);
		LinkedListNode l6 = new LinkedListNode(6);
		LinkedListNode l7 = new LinkedListNode(7);
		LinkedListNode head = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		l4.next = l3;
		l5.next = l6;
		l6.next = l7;
		l7.next = null;

		System.out.println(llc.hasCycle(head));
	}

	public boolean hasCycle(LinkedListNode head){

		LinkedListNode pointer1=head;
		LinkedListNode pointer2 = head;

		while(pointer2.next!=null){
			pointer1 = pointer1.next;
			pointer2 = pointer2.next.next;
			if(pointer1 == pointer2)
				return true;
		}
		return false;
	}
}
