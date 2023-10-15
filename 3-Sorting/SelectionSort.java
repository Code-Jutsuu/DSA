package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		

		// selection sort = search through an array and keep track of the minimum value during 
		//			        each iteration. At the end of each iteration, we swap values.
		
		//				 Quadratic time O(n^2)
		//				 small data set = okay
		//				 large data set = BAD
		
		int[] arr = {9, 1, 8, 2, 7, 3, 6, 4, 5};
		
		selection(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	static void selection(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n -1; i++) {
			int min = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
	static void swap(int[] a, int b, int c) {
		int temp = a[b];
		a[b]=a[c];
		a[c]=temp;
	}

}
