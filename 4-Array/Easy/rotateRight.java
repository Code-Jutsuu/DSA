package array;

public class rotateRight {

	public static void main(String[] args) {
		int k = 1;
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		
	    k = k%arr.length;

         rotateRight(arr, k);
         for(int i :arr) {
        	 System.out.print(i+" ");
         }

    }
    public static void rotateRight(int[] arr, int k){

        int n = arr.length;

        reverse(arr, 0, n-1-k);

        reverse(arr, n-k, n-1);

        reverse(arr, 0, n-1);
        
    }
    public static void reverse(int[] arr, int s , int e){
        
    	while(s<=e){
         int temp = arr[s];
         arr[s] = arr[e];
         arr[e] = temp;
         s++;
         e--;
        }
       
    }
}
