package cch.sort;
/**
 * 
 * @author chen
 * Best case: O(n)
 * Average case: O(n^2)
 * Worst case: O(n^2)
 */
public class Bubble {

	public Bubble() {
		// TODO Auto-generated constructor stub
	}
	
	public static int[] bubbleSort(int arr[]){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) { 
				if( arr[i] > arr[j] ){
			       int temp = arr[i];
			       arr[i] = arr[j];
			       arr[j] = temp;
			    }
			}
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  arr[]={100,20,15,30,5,75,40};
		bubbleSort(arr);
	}

}
