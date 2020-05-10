package com.test.search;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };// 源数据
		int key = 23;
		int ret = biSearch(arr, key);
		System.out.println(ret);
	}

	public static int biSearch(int arr[], int a) {
		int start = 0;
		int end = arr.length - 1;

		int mid;
		while (start <= end) {
			mid = (start + end) / 2;

			if (arr[mid] < a) {
				start = mid + 1;
			} else if (arr[mid] > a) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;//找不到
	}
}
