/**
 * 
 */
package cch.linklist;


/**
 * @author chen
 *
 */
//class Node{
//	int val; // 節點的值
//	Node next; // 節點
//	Node(int x){ val = x; }
//}
public class SinglyLinkedList {
	
	/**
	 * 初始節點
	 */
	public SinglyLinkedList() {
		// TODO Auto-generated constructor stub
		head = null;
	}

	
	private class Node{
		int val; // 節點的值
		Node next; // 節點
		Node(int x){ val = x; }
	}
	
	private Node head; // 判斷結尾
	
	public Node getHead() {
		return head;
	}

	/**
	 * 插入至第一個節點
	 */
	
	public void insertFirstNode(int val){
		Node node = new Node(val);
		node.next = head; // 指向 head 節點
		head = node;
	}
	
	/**
	 * 刪除至第一個節點
	 */
	
	public Node deleteFirstNode() {
		Node temp = head;
		head = head.next;
		return temp;
	}
	
//	public Node deleteFirstNode(Node node) {
//		Node temp = head;
//		head = head.next;
//		return temp;
//	}
	
	/**
	 * 刪除至某節點，刪除首節點使用 deleteFirstNode()
	 */
	
	public void deleteNode(int val){
		Node temp = head;
		while(temp.next != null && temp.next.val != val)
			temp = temp.next;
		if(temp.next != null)
			temp.next = temp.next.next;
		
	}
	
//	public void deleteAfterNode(Node after){
//		Node temp = head;
//		while(temp.next != null && temp.val != after.val)
//			temp = temp.next;
//		if(temp.next != null )
//			temp.next = temp.next.next;
//	}
	
	/**
	 * 
	 * @param index 插入至第幾個索引之後,不適合插入至最後一個索引之後
	 * @param val 插入的值
	 */
	public void insertAfterNode(int index,int val){
		Node temp = head;
		while(temp.next != null && index > 1){
			temp = temp.next;
			index --;
		}
		if(temp.next != null){
			Node newNode = new Node(val);
			newNode.next = temp.next;
			temp.next = newNode;
		}
	}
	
	/**
	 * 插入至最後一個節點
	 */
	
	public void insertLastNode(int val){
		Node current = head;
		while (current.next != null) // 找到最後一個節點
			current = current.next;
		  Node newNode = new Node(val);
		  current.next = newNode;
	}
	
	/**
	 * 印出所有節點
	 */
	
	public void printLinkedList() {
		System.out.println("Printing LinkedList (head --> last) ");
		Node current = head;
		while (current != null) {
			System.out.printf("{ %d }-->",current.val);
			current = current.next;
		}
		System.out.println();
	}

	public static void main(String [] arg){
		SinglyLinkedList myLinkedlist = new SinglyLinkedList();
		myLinkedlist.printLinkedList();
		myLinkedlist.insertFirstNode(5);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertFirstNode(6);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertFirstNode(7);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertFirstNode(1);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertLastNode(2);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertFirstNode(10);
		myLinkedlist.printLinkedList();
		myLinkedlist.deleteNode(6);
		myLinkedlist.printLinkedList();
		myLinkedlist.deleteNode(10);
		myLinkedlist.printLinkedList();
		myLinkedlist.deleteNode(2);
		myLinkedlist.printLinkedList();
		myLinkedlist.deleteNode(7);
		myLinkedlist.printLinkedList();
		myLinkedlist.deleteNode(5);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertAfterNode(1, 5);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertAfterNode(1, 9);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertAfterNode(2, 100);
		myLinkedlist.printLinkedList();
		myLinkedlist.insertLastNode(200);
		myLinkedlist.printLinkedList();
//		System.out.println(myLinkedlist.getHead());
		
		
		
	}

}
