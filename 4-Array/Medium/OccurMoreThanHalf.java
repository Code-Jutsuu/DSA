import java.util.HashMap;
import java.util.Map;

public class OccurMoreThanHalf {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);

    }
    //------------------------------Method 1------------------------------------------------------

    private static int majorityElement(int[] arr) {
       
        int n = arr.length;

        for(int i =0;i<n ; i++){
            //selected element is v[i]
            int cnt = 0;
            for(int j = 0; j<n; j++){
                 // counting the frequency of v[i]
                if(arr[i]==arr[j]){
                    cnt++;
                }
            }
            // check if frquency is greater than n/2:
            if(cnt>(n/2))
            return arr[i];
        }
        return 0;
    }
    
    //--------------------------------Method 2-----------------------------------------------------------

     private static int majorityElement2(int[] arr) {

        int n = arr.length;

        HashMap<Integer,Integer> map  = new HashMap<>();

        //storing the elements with its occurnce:
        for(int i = 0; i<n; i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i], value+1);
        }

        //searching for the majority element:
        for(Map.Entry<Integer, Integer> j : map.entrySet()){
            if(j.getValue() > (n/2)){
                return j.getKey();
            }
        }
        return -1;
     }
//---------------------- Method 3 ----------------------------------------------------------------------------
     public int majorityElement3(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find the potential candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Validate the candidate as the majority element
        // (In this problem, assuming the majority element always exists)
        return candidate;
}
