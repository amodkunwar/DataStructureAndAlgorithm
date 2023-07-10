package com.alogorith.sorting;

/**
 * In place algorithm
 * O(n2) time complexity
 * It will take 100 steps to sort 10 items.
 * It is stable algorithm 
 * Here instead of swapping we will shift the elements
 * 
 * @author amodk
 *
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = { 20, 35, -15, 4 };

		for (int i = 1; i < arr.length; i++) {
			int newElement = arr[i];
			int j;

			for (j = i; j > 0 && arr[j - 1] > newElement; j--) {
				arr[j] = arr[j - 1];
			}
			arr[j] = newElement;
		}

		for (int a : arr) {
			System.out.println(a);
		}

	}

}
