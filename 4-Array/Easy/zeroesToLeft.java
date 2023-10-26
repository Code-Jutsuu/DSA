public class zeroesToLeft {
    public static void main(String[] args) {
    //     int[] arr = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
    //     int n = 10;

    //     int[] ans = zero(n, arr);
    //     for (int i = 0; i < n; i++) {
    //         System.out.print(ans[i] + " ");
    //     }
    //     System.out.println("");
    
    int[] array = {2, 3, 4, 0, 1, 5, 0};

        shiftZeroes(array);

        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    private static void shiftZeroes(int[] array) {

        int count = 0;

        for(int i=0; i<array.length; i++){
            
            if(array[i] != 0){
                array[count++] = array[i];
                
            }
        }
        while(count < array.length){
            array[count] = 0;
            count++;
        }
     

     }
    // public static int[] zero(int n, int []arr) {
    //     int j = -1;
    //     //place the pointer j:
    //     for(int i =0; i<n; i++){
    //         if(arr[i] == 0){
    //             j=i;
    //             break;
    //         }
    //     }
    //     //no non-zero elements:
    //     if(j == -1){
    //         return arr;
    //     }
    //     //Move the pointers i and j
    //     //and swap accordingly
    //     for(int i = j+1; i<n; i++){
    //         if(arr[i] != 0){
    //             int tmp = arr[i];
    //             arr[i] = arr[j];
    //             arr[j] = tmp;
    //             j++;
    //         }
    //     }
    //     return arr;
    // }
}

//----------------zeroes in right------------

/*class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
       
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 0){
                int tmp = nums[i];
                nums[i] = nums[j];
                nums[j] = tmp;
                j++;
            }
        }
        return ;  
  } */