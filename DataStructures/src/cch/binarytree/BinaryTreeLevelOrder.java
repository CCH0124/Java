package cch.binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BinaryTreeLevelOrder {

	public BinaryTreeLevelOrder() {
		// TODO Auto-generated constructor stub
	}
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){ val = x; }
	}
 
	// prints in level order
	public static void levelOrderTraversal(TreeNode startNode){
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(startNode);
		while( !queue.isEmpty() ){
			TreeNode tempNode = queue.poll(); // ¦^¶Ç top
			System.out.printf("%d ",tempNode.val);
		
			if( tempNode.left != null )
				queue.add(tempNode.left);
			if( tempNode.right != null )
				queue.add(tempNode.right);
		}
	}
	
	public static void main(String [] args){
		// TODO Auto-generated method stub
		BinaryTreeLevelOrder bl = new BinaryTreeLevelOrder();
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
		rootLeftNode.right = node_30;
		 
		rootRightNode.left = node_50;
		rootRightNode.right = node_70;
		
		System.out.println("Level Order traversal of binary tree will be:");
		levelOrderTraversal(rootNode);
	}

}
