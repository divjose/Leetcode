package LeetCode;

public class IntersectionOfLL {
	public static void main(String[] args) {
		IntersectionOfLL Ill = new IntersectionOfLL();
		LinkedListNode a1 = new LinkedListNode(1);
		LinkedListNode a2 = new LinkedListNode(2);
		LinkedListNode c1 = new LinkedListNode(10);
		LinkedListNode c2 = new LinkedListNode(4);
		LinkedListNode c3 = new LinkedListNode(5);
		a1.next = a2;
		a2.next = c1;
		c1.next = c2;
		c2.next = c3;
		c3.next = null;

		LinkedListNode b1 = new LinkedListNode(1);
		LinkedListNode b2 = new LinkedListNode(2);
		LinkedListNode b3 = new LinkedListNode(3);
		b1.next = b2;
		b2.next = b3;
		b3.next = c1;
		c1.next = c2;
		c2.next = c3;
		c3.next = null;
		
		Ill.intersectionOfLL(a1, b1);
	}

	public LinkedListNode intersectionOfLL(LinkedListNode a,LinkedListNode b){
			int counterA= 0;
		int counterB =0 ;
		int startFrom = 0;
		LinkedListNode intersectionNode = null;
		LinkedListNode nextA = a;
		LinkedListNode nextB = b;
		LinkedListNode headA = a;
		LinkedListNode headB = b;
		
		while(nextA!=null){
			counterA =counterA +1;
			nextA = nextA.next;
		}

		while(nextB!=null){
			counterB =counterB +1;
			nextB = nextB.next;
		}
		startFrom = Math.abs(counterA - counterB);
		
		if(counterA>counterB){
			while(startFrom!=0){
				headA = headA.next;
				startFrom --;
			}
		}
		else{
			while(startFrom != 0){
				headB = headB.next;
				startFrom --;
			}
		}
		
		while(headA!= null && headB!= null){
			if(headA.next == headB.next){
				intersectionNode = headB.next;
				System.out.println(intersectionNode.value);
				return intersectionNode;
			}
			headA = headA.next;
			headB = headB.next;
		}
		return null;
	}
}
