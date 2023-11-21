public class SubarrMaxSubArrSum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        int maxSum = (int) maxSubarraySum(arr, n);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }
    public static long maxSubarraySum(int[] arr, int n) {
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        int start = 0;
        int ansStart = -1, ansEnd = -1;
        
        for (int i = 0; i < n; i++) {

            if (sum == 0) start = i; // starting index

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;

                ansStart = start;
                ansEnd = i;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        //printing the subarray:
        System.out.print("The subarray is: [");
        for (int i = ansStart; i <= ansEnd; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("]n");

        // To consider the sum of the empty subarray
        // uncomment the following check:

        //if (maxi < 0) maxi = 0;

        return maxi;
    }

    // ------------------------------------  2  ---------------------------------------------

    public static int longestSubarrayWithSumK(int []a, long k) {
        int n = a.length;
        int maxLength = 0;
        long sum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];

            while (sum > k) {

                // If the sum is greater than k, we need to reduce the sum by moving the starting point of the subarray.

                sum -= a[start];
                start++;

            }

            if (sum == k) {

                // If the current subarray sums up to k, it is a potential longest subarray
                maxLength = Math.max(maxLength, i - start + 1);

            }

        }

        return maxLength;
    }
}
