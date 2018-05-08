/**
 * 
 */
package cch.binarytree;

import java.util.Stack;

/**
 * @author chen
 * PostOrder 
 * Traverse the left subtree in PostOrder.
 * Traverse the right subtree in PostOrder.
 * Visit the node.
 */
public class BinaryTreePostOrder {

	/**
	 * 
	 */
	public BinaryTreePostOrder() {
		// TODO Auto-generated constructor stub
	}
	
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x)
		{
			val = x;
		}
	}
	
	// Recursive Solution
	public void postOrder(TreeNode root) {
		if( root !=  null ) {
			postOrder(root.left);
			postOrder(root.right);
			//Visit the node by Printing the node data  
			System.out.printf("%d ",root.val);
		}
	}

	// Iterative solution
	public void postorderIter( TreeNode root){
		if( root == null )
			return;
		
		Stack<TreeNode> stack = new Stack<>();
		
		TreeNode currentNode = root;
		
		while( true ){
			if( currentNode != null ) {
				if( currentNode.right != null ) 
					stack.push( currentNode.right );
				stack.push( currentNode );
				currentNode = currentNode.left;
				continue;
			}
 
			if( stack.isEmpty() ) 
				return;
			currentNode = stack.pop();
 
			if( currentNode.right != null && ! stack.isEmpty() && currentNode.right == stack.peek() ) {
				stack.pop();
				stack.push( currentNode );
				currentNode = currentNode.right;
			} else {
				System.out.print( currentNode.val + " " );
				currentNode = null;
			}
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
