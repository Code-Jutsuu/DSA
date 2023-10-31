

public class rotateArrayNTimes {
    
    public static void main(String[] args) {
        int  arr[] = {1,2,3,4,5,6,7};
        int n = arr.length;
        int r = 4;

        //rotate(arr,n,r);
        rotate2(arr,n,r);

        System.out.println("After Rotating the elements to left ");
         for (int i = 0; i < n; i++) {
          System.out.print(arr[i] + " ");
         }
    }

    // ---------------------- using temp array-----------

    static void rotate(int[] arr, int n , int r){

        if (arr == null || arr.length == 0 || r<= 0) {
            return;
        }

        int temp[] = new int[r];
        r = r%n;

        for(int i = 0; i<r; i++){
            temp[i] = arr[i];
        }
        for(int i = 0; i<n-r; i++){
            arr[i] = arr[i+r];
        }
        int j = 0;
        for(int i = n-r; i<n; i++){
            arr[i] = temp[j]; // temp[ n-]
            j++;
        }
    }
            

    

    //----------------------------using reverse---------------
    
     static void rotate2(int[] arr, int n, int r){

         reverse( arr, 0 , r-1);
         
         reverse(arr, r, n-1);

         reverse(arr, 0, n-1);
        
        
    }

    static void reverse(int[] arr, int s, int e){

        while(s<=e){
          int temp = arr[s];
          arr[s] = arr[e];
          arr[e] = temp;
          s++;
          e--;

        }
        
    } 

    
}
