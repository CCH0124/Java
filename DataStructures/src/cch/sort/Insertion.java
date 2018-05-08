/**
 * 
 */
package cch.sort;

/**
 * @author chen
 * 比較索引處的值與其所有先前的元素來工作
 * Best case: O(n)
 * Average case: O(n^2)
 * Worst case: O(n^2)
 *
 */
public class Insertion {

	/**
	 * 
	 */
	public Insertion() {
		// TODO Auto-generated constructor stub
	}
	public static int[] insertionSort(int arr[]){
		for(int i = 1; i < arr.length; i++){ 
			int up = arr[i]; 
			int j = i; // If we get smaller value than valueToSort then , we stop at that index. 
			while(j > 0 && arr[j - 1] > up){
				arr[j] = arr[j-1];
				j--;
			}
	          
			// We will put valueToSort at that index
			arr[j] = up;
			
			System.out.print((i)+": ");
			printArray(arr);
		}
	  
		return arr;
	}
	 
	 public static void printArray(int arr[]){
		 for(int i = 0; i <arr.length; i++){
			 System.out.print(arr[i]+" ");
		 }
		 System.out.println();
	 
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[]={100,20,15,30,5,75,40};
		insertionSort(arr);

	}

}
