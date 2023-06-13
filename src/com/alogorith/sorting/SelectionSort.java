package com.alogorith.sorting;

/**
 * In place algorithm
 * O(n2) time complexity - quadratic
 * It will take 100 steps to sort 10 items and so on
 * Does not require as much as swapping as bubble sort
 * Unstable sort algorithm
 * 
 * 
 * 
 * @author amodk
 *
 */
public class SelectionSort {

	public static void main(String[] args) {

		int[] arr = { 50, 12, 34, -12, 54, 6 };

		for (int lastIndex = arr.length - 1; lastIndex > 0; lastIndex--) {
			int largest = 0;
			for (int i = 1; i <= lastIndex; i++) {
				if (arr[i] > arr[largest]) {
					largest = i;
				}
			}

			swap(arr, largest, lastIndex);

		}
		
		printArr(arr);

	}

	public static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

	public static void printArr(int[] arr) {
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
