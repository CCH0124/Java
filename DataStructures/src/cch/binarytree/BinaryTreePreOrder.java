/**
 * 
 */
package cch.binarytree;

import java.util.Stack;

/**
 * @author chen
 * PreOrder :
 * Visit the node.
 * Traverse the left subtree in PreOrder.
 * Traverse the right subtree in PreOrder.
 *
 */
public class BinaryTreePreOrder {

	/**
	 * 
	 */
	public BinaryTreePreOrder() {
		// TODO Auto-generated constructor stub
	}
	private static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val = x;
		}
	}
	
	// Recursive Solution
	public void preorder(TreeNode root) {
		if( root !=  null ) {
			//Visit the node-Printing the node data  
			System.out.printf("%d ",root.val);
			preorder(root.left);
			preorder(root.right);
		}
	}
	
	// Iterative solution
	public void preorderIter(TreeNode root) {
	 
		if( root == null )
			return;
	 
		Stack<TreeNode> stack = new Stack<>();
		
		stack.push(root);
		
		while( !stack.empty() ){

			TreeNode node = stack.pop();
			System.out.printf("%d ",node.val);
	 
			if(node.right != null){
				stack.push(node.right);
			}
			
			if(node.left != null){
				stack.push(node.left);
			}
	 
		}
	 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreePreOrder bi=new BinaryTreePreOrder();
		// Creating a binary tree
		TreeNode rootNode = new TreeNode(40);
		TreeNode rootLeftNode = new TreeNode(20);
		TreeNode node_10 = new TreeNode(10);
		TreeNode node_30 = new TreeNode(30);
		TreeNode rootRightNode = new TreeNode(60);
		TreeNode node_50 = new TreeNode(50);
		TreeNode node_70 = new TreeNode(70);
 
		rootNode.left = rootLeftNode;
		rootNode.right = rootRightNode;
 
		rootLeftNode.left = node_10;
		rootRightNode.right = node_30;
 
		rootRightNode.left = node_50;
		rootRightNode.right = node_70;
 
		System.out.println("Using Recursive solution:");
 
		bi.preorder(rootNode);
 
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Using Iterative solution:");
 
		bi.preorderIter(rootNode);

	}

}
