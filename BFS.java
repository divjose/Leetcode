package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class TreeNode{

	int data;
	TreeNode left,right;

	public TreeNode(int data){
		this.data = data;
		this.left=null;
		this.right=null;
	}
}

public class BFS {

	public static void main(String args[]){

		BFS bfs = new BFS();
		TreeNode root = new TreeNode(10);
		TreeNode r1 = new TreeNode(5);
		TreeNode r2 = new TreeNode(12);
		TreeNode r3 = new TreeNode(8);
		TreeNode r4 = new TreeNode(6);
		TreeNode r5 = new TreeNode(7);

		root.left = r1;
		root.right = r2;
		r1.left = r3;
		r1.right = r4;
		r2.left = r5;

		bfs.bfs(root);
		//bfs.dfs(root);
	}

	public void bfs(TreeNode root){

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);

		while(!queue.isEmpty()){			
			TreeNode item = queue.peek();
			System.out.println(queue.poll().data);
			if(item.left!=null)
				queue.add(item.left);
			if(item.right!=null)
				queue.add(item.right);
		}
	}
	
	public void dfs(TreeNode root){
		
		Stack stack = new Stack();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode item = (TreeNode) stack.pop();			
			System.out.println(item.data);
			
			if(item.right!=null){
				stack.push(item.right);
			}
			if(item.left!=null){
				stack.push(item.left);	
			}
		}
	}
}

