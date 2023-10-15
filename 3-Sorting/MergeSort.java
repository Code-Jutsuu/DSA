package Sorting;

public class MergeSort {

	public static void main(String[] args) {
		
		// merge sort = recursively divide array in 2, sort, re-combine
    	// run-time complexity = O(n Log n)
    	// space complexity    = O(n)
		
		   int[] array = {8, 2, 5, 3, 4, 7, 6, 1};
		   
		   mergeSort(array);
		   
	        for(int i = 0; i < array.length; i++){
	            System.out.print(array[i]+ " ");
	        }
	   }
	
	public static void mergeSort(int[] arr) {
		int length  = arr.length;
		if(length<=1) return ;    // base case
		
		int mid = length/2;
		int[] leftArr = new int[mid];
		int[] rightArr = new int[length - mid];
		
		int i = 0;
		int j = 0;
		
		for(; i<length; i++) {
			if(i<mid) {
				leftArr[i] = arr[i];
			}
			else {
				rightArr[j] = arr[i];
				j++;
			}
			
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		merge(leftArr, rightArr, arr);
	}
	
	private static void merge(int[] leftArr, int[] rightArr, int[] arr) {
		
		int leftSize = arr.length/2; //
		int rightSize = arr.length - leftSize;
		int i = 0, l = 0, r = 0;
		
		//check the conditions for merging
		while(l<leftSize && r<rightSize) {
			if(leftArr[l] < rightArr[r]) {
				arr[i] = leftArr[l];
				i++;
				l++;
				
			}
			else {
				arr[i] = rightArr[r];
				i++;
				r++;
			}
		}
		while(l<leftSize) {
			arr[i] = leftArr[l];
			i++;
			l++;
		}
		while(r<rightSize) {
			arr[i] = rightArr[r];
			i++;
			r++; 
		}
	}
	
}
