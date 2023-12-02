public class MaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    //------------------------------Method 1---------------------------

    private static int maxSubarraySum(int[] arr, int n) {
       int maxi = Integer.MIN_VALUE;

       for(int i = 0;i<n; i++){
        int sum = 0;
        for(int j = i; j<n; j++){

            sum +=arr[j];

            maxi = Math.max(maxi, sum);

        }
       }
        return maxi;
    }

    //--------------------------------Method 2-------------------------------
    

    public static int maxSubarraySum2(int[] arr, int n) {
        int maxi = Integer.MIN_VALUE;// maximum sum
        int sum = 0;

        
        for(int i = 0; i<n; i++){

            
            sum +=arr[i];

            if(sum>maxi){
                maxi = sum;

               
            }
            // If sum < 0: discard the sum calculated
            if(sum<0){
                sum = 0;
            }

        }
           // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;
          return maxi;
        
    }
}
