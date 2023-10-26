public class missingNum {
    public static void main(String[] args) {
        
        int nums[] = {2, 1};
        int missing = findMissing(nums);
        System.out.println("Missing no. is "+missing);
    }

    private static int findMissing(int[] nums) {

        int n = nums.length + 1;
        int expectedSum = (n * (n + 1)) / 2;

        int actualSum = 0;

        for(int i: nums){
            actualSum += i;
        }

        return expectedSum - actualSum;
    }
}
