package com.alogorith.sorting;

/**
 * In place algorithm 
 * O(n2) time complexity - quadatic 
 * It will take 100 steps to sort 10 items, 10000 steps to sort 100 items Algorithms degrades quickly
 * Stable sort algorithm
 * 
 * @author amodk
 *
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 50, 12, 34, -12, 54, 6 };

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j+1);
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

	public static void swap(int[] arr, int i, int j) {
		if (i == j) {
			return;
		}

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}

}
