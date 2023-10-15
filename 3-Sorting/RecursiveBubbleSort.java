package Sorting;

public class RecursiveBubbleSort {

	public static void main(String[] args) {
		int arr[] = {9, 4, 7, 2, 6, 1, 3, 5};
		
		BubbleSort(arr, arr.length);
		for(int n: arr) System.out.print(n +" ");
	}

	private static void BubbleSort(int[] arr,int n) {
		if(n<=1) return;
		
		for(int i = 0; i<n-1; i++) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			
		}
		BubbleSort(arr, n-1);
	}

}
