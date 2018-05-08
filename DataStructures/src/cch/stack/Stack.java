/**
 * 
 */
package cch.stack;
/**
 * @author chen
 *
 */
public class Stack {
	
	private int size;
	private int [] data;
	private int top;
	
	
	/**
	 * @param size
	 * return °}¦C¤j¤p
	 */
	public Stack(int size){
		this.size = size;
		this.data = new int [size];
		top = -1;
	}
	
	public boolean isFull() {
        return top == size - 1;
    }
	
	public boolean isEmpty(){
		return top == -1;
	}
	
	public int push(int element){
		if(!isFull()){
			top++;
			this.data[top] = element;
			return element;
		}else{
		    throw new IllegalStateException("Stack is empty");
		}
	}
	
	public int pop(){
		if(!isEmpty()){
			int returnTop = this.data[top];
			top--;
			return returnTop;
		}else{
		    throw new IllegalStateException("Stack is empty"); 
		}
	}
	
//	public int pop(){
//		return data[top--];
//	}
	
	
	public int peek() {
		return data[top];
	}
	
	
	public int size(){
		return top + 1; 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		 TODO Auto-generated method stub
			Stack Stack = new Stack(10);
//			Stack.pop();
			
			Stack.push(10);
			Stack.push(30);
			Stack.push(50);
			Stack.push(60);
			Stack.push(70);
			Stack.push(80);
			Stack.push(90);
			
			Stack.pop();
			Stack.pop();
			Stack.pop();
		
			System.out.println(Stack.peek());
	}

}
