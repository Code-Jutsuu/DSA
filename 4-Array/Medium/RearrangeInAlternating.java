import java.util.ArrayList;

public class RearrangeInAlternating {
    public static void main(String[] args) {
        // Array Initialisation.
        int n = 7;
        int A[]= {1,2,-4,-5,-6,8,-2,};


        int[]ans= RearrangebySign(A,n);
        
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
  }
    }

    private static int[] RearrangebySign(int[] a, int n) {
      
         // Define 2 vectors, one for storing positive 
         // and other for negative elements of the array.
         ArrayList<Integer> pos = new ArrayList<>();
         ArrayList<Integer> neg = new ArrayList<>();
        
          // Segregate the array into positives and negatives.
        for(int i =0; i<a.length; i++){
            if(a[i]>0){
                pos.add(a[i]);
            }
            else{
                neg.add(a[i]);
         }
        }
         // Positives on even indices, negatives on odd.
        for(int i = 0; i<n/2; i++){
            a[2*i] = pos.get(i);
            a[2*i+1] = neg.get(i);
        }
        
         return a;
    }

    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
    
        int posIdx = 0;
        int negIdx = 1;
    
        for (int num : nums) {
            if (num > 0) {
                result[posIdx] = num;
                posIdx += 2;
            } else {
                result[negIdx] = num;
                negIdx += 2;
            }
        }
    
        return result;
    }
}
