/**
 * 
 */
package cch.binarytree;

import java.util.Stack;


/**
 * @author chen
 * InOrder
 * Traverse the left subtree in InOrder.
 * Visit the node.
 * Traverse the right subtree in InOrder.
 *
 */
public class BinaryTreeInOrder {

	/**
	 * 
	 */
	public BinaryTreeInOrder() {
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
	public void inOrder(TreeNode root) {
		if(root !=  null) {
			inOrder(root.left);
			System.out.printf("%d ",root.val);
			inOrder(root.right);
		}
	}
	// Iterative solution
	public void inOrderIter(TreeNode root) {
	 
		if( root == null )
			return;
	 
		Stack<TreeNode> stack = new Stack<>();
			
		TreeNode currentNode = root;
	 
		while( !stack.empty() || currentNode != null ){
	 
			if( currentNode != null ){
				stack.push(currentNode);
				currentNode = currentNode.left;
			}else{
				TreeNode n = stack.pop();
				System.out.printf("%d ",n.val);
				currentNode = n.right;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeInOrder bi = new BinaryTreeInOrder();
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
 
		bi.inOrder(rootNode);
 
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Using Iterative solution:");
 
		bi.inOrderIter(rootNode);

	}

}
