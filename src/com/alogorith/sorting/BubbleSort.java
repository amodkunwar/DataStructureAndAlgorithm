package com.alogorith.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 50, 12, 34, -12, 54, 6 };

		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (arr[j] > arr[j + 1]) {
					swap(arr, j);
				}
			}
		}
		for (int a : arr) {
			System.out.println(a);
		}

	}

	public static void swap(int[] arr, int i) {
		if (i == i + 1) {
			return;
		}
		int temp = arr[i];
		arr[i] = arr[i + 1];
		arr[i + 1] = temp;

	}

}
