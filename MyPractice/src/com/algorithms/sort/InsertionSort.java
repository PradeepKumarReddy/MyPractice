package com.algorithms.sort;

public class InsertionSort {

	public int[] insertionSort(int[] arr) {
		for (int i=1 ; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				} 
			}
		}
		return arr;
	}
	
	public void swap(int[] arr, int current, int swap) {
		int temp = arr[current];
		arr[current] = arr[swap];
		arr[swap] = temp;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		int[] arr = {3,2,1,4,1,5,2,3};
		int[] arr1 = {10,34,2,56,7,67,88,42};
		arr = sort.insertionSort(arr1);
		for(int i=0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
	}

}
