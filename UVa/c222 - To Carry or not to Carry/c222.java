
import java.lang.Integer;
import java.util.Arrays;
import java.util.Scanner;
/**
 * @author chen
 *
 */
public class c222 {
	private static final int MAX = 32;
	private int bit []; // 32位元;
	private StringBuilder s;

	public int[] convertBinary(int num) {
		bit = new int[MAX];
		int index = bit.length;
		while(num > 0) {
			bit[--index] = num%2;
			num = num/2;
		}
		return bit;
	}
	
	public int addResult(int num1[],int num2[]) {
		s = new StringBuilder();
		for(int i=0; i<MAX; i++) {
			if(num1[i] == num2[i]) 
				s.append(0);
			else 
				s.append(num1[i] + num2[i]);
		}
		return Integer.parseInt(s.toString(), 2);
	}
  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		c222 test = new c222();
		while(sc.hasNextInt()) {
			int f = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(test.addResult(test.convertBinary(f), test.convertBinary(s)));
		}
	}

}
