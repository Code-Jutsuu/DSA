import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        
    }
// optiomal

    public static int subarraySum(int[] nums, int k) {
     int count = 0;
      int sum = 0;

     // Map to store the frequency of encountered sums
     Map<Integer, Integer> sumFreq = new HashMap<>();
     sumFreq.put(0, 1); // To consider cases where sum - k = 0

       for (int num : nums) {
            sum += num;

            // If (sum - k) is found in the map, increment the count by the frequency
          if (sumFreq.containsKey(sum - k)) {
              count += sumFreq.get(sum - k);
          }

          // Increment the frequency of the current sum in the map
           sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
     }

        return count;
    }

}
/* 
better
public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            int sum = 0;
            for (int j = i; j < n; j++) { // ending index j
                // calculate the sum of subarray [i...j]
                // sum of [i..j-1] + arr[j]
                sum += arr[j];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;

brute
 public static int findAllSubarraysWithGivenSum(int arr[], int k) {
        int n = arr.length; // size of the given array.
        int cnt = 0; // Number of subarrays:

        for (int i = 0 ; i < n; i++) { // starting index i
            for (int j = i; j < n; j++) { // ending index j

                // calculate the sum of subarray [i...j]
                int sum = 0;
                for (int K = i; K <= j; K++)
                    sum += arr[K];

                // Increase the count if sum == k:
                if (sum == k)
                    cnt++;
            }
        }
        return cnt;

*/