package LeetCode;

public class FlattenBinaryToLL {
	public static void main(String[] args) {

		FlattenBinaryToLL fbll = new FlattenBinaryToLL();
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(4);
		TreeNode t5 = new TreeNode(5);
		TreeNode t6 = new TreeNode(6);
		t1.left = t2;
		t1.right = t5;
		t2.left = t3;
		t2.right = t4;
		t5.right = t6;

		//fbll.flatten(t1);	
	}

	//	public void flatten(TreeNode root){

	//		LinkedListNode l1 = new LinkedListNode();
	//		LinkedListNode l2 = new LinkedListNode();
	//		LinkedListNode l3 = new LinkedListNode();
	//		LinkedListNode l4 = new LinkedListNode();
	//		LinkedListNode l5 = new LinkedListNode();
	//		LinkedListNode l6 = new LinkedListNode();
	//		l1.next = l2;
	//		l2.next = l3;
	//		l3.next = l4;
	//		l4.next = l5;
	//		l5.next = l6;
	//		l6.next = null;
	//		
	//		LinkedListNode head = l1;
	//		LinkedListNode current = head;
	//		LinkedListNode next = head.next;
	//		
	//		if(root == null)
	//			return;
	//		
	//		
	//		//System.out.print("\t"+ root.data);
	//		while( next!= null){
	//			head.value = root.data;
	//			next= current.next;
	//			
	//		}
	//		
	//		flatten(root.left);
	//		flatten(root.right);


}



