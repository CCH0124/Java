/**
 * 
 */
package cch.sort;

import java.util.Arrays;

/**
 * @author chen
 * ���C�����̤p�����C
 * �η�e�����洫�̤p�����C
 * ���ƾ�ӹL�{����Ʋէ����ƧǡC
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
			int index = i; // ��l�q i
			// ���C�����̤p����
			for(int j=i+1; j<arr.length; j++)
				if(arr[j] < arr[index]) // �j�M���e�ƭȤp���� 
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
