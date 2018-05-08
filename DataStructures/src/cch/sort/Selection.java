/**
 * 
 */
package cch.sort;

import java.util.Arrays;

/**
 * @author chen
 * тい程じ
 * ノ讽玡じユ传程じ
 * 狡俱筁祘计舱Ч逼
 * Best case : O(N^2)
 * Average case : O(N^2)
 * Worst case : O(N^2)
 */
public class Selection {

	/**
	 * 
	 */
	public Selection() {
		// TODO Auto-generated constructor stub
	}
	
	public static int[] selectionSort(int [] arr){
		for(int i=0; i<arr.length-1; i++){
			int index = i; // ﹍眖 i
			// тい程じ
			for(int j=i+1; j<arr.length; j++)
				if(arr[j] < arr[index]) // 穓碝ゑ讽玡计 
					index = j;
			// swap
			int temp = arr[index];
			arr[index] = arr[i];
			arr[i] = temp;
			System.out.print((i+1)+": ");
			printArray(arr);
		}
		return arr;
		 
	}
	
	public static void printArray(int arr[]){
		for(int i = 0; i <arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {40,10,-30,45,39,32};
		selectionSort(arr);
//		arr = selectionSort(arr);
//		System.out.println(Arrays.toString(arr));

	}

}
