import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int n =4;

      //  method 1-------------------
        int[] result = findTwoSum(nums, target);

       if (result.length == 2) {
           System.out.println("Indices of the two numbers that add up to the target sum: " + result[0] + ", " + result[1]);
       } else {
           System.out.println("No solution found.");
        }
        
    //method 2---------------

     //int[] ans = twoSum(n, nums, target);

    // System.out.println(ans[0]+" "+ans[1]);

    }

    private static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store the elements and their indices.
       HashMap<Integer , Integer> map  = new HashMap<>();

       // If the complement exists in the map, return the indices.
        for(int i =0; i<nums.length; i++){
            int diff = target - nums[i];

            
            if(map.containsKey(diff)){
                return new int[] {map.get(diff), i};
            }

            // Otherwise, add the current element and its index to the map.
            map.put(nums[i], i);
        }
             
        // If no solution is found, return an empty array.
            return new int[]{-1,-1};
        
    }
    
    //--------------------------- 2 pointer---------------

    public static int[] twoSum(int n, int []arr, int target) {
        
        int ans[] = new int[2];
        ans[0]=ans[1] = -1;
        for(int i = 0; i<n;i++){
            for(int j = i+1; j<n;j++){
                if(arr[i]+arr[j]==target);
                ans[0] = i;
                ans[1] = j;

                return ans;
            }
        }
        return ans;
  
    }
}
