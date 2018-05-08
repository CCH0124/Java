package cch.stack;
/**
 * 
 */
import cch.stack.*;
/**
 * @author chen
 *
 */
public class ReverseString {
	
 	
	public Stack pushChars(String input){
		Stack stack = new Stack(input.length());
		char [] chars = input.toCharArray(); 
		for (char c : chars)
			 stack.push(c);
		
		return stack;
	}
	
	public String popReverse(Stack stack){
		StringBuffer result = new StringBuffer();
		while(!stack.isEmpty()){
			result.append((char)stack.pop());
		}
		
		return result.toString();
	}
	public ReverseString(String input){
		System.out.println(popReverse(pushChars(input)));
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseString rs = new ReverseString("QQQAAA");
	}

}
