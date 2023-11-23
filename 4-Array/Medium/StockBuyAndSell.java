public class StockBuyAndSell {
    public static void main(String[] args) {
       
        int arr[] = {7,1,5,3,6,4};

        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }

    private static int maxProfit(int[] arr) {
      int maxPro = 0;

      for(int i = 0; i<arr.length; i++){
        for(int j = i+1; j<arr.length; j++){

            if(arr[j] > arr[i]){
                maxPro = Math.max(maxPro, arr[j] - arr[i]); //compare profit
            }
        }
      }
        return maxPro;
    }

    //-----------------------------------------------

    public int maxProfit2(int[] prices) {
      
        int minPrice = Integer.MAX_VALUE; // Initialize the minimum price as a large value
        int maxProfit = 0; // Initialize the maximum profit as 0
  
      for (int price : prices) {
          if (price < minPrice) {
              minPrice = price; // Update the minimum price if a lower price is found
          } else if (price - minPrice > maxProfit) {
              maxProfit = price - minPrice; // Update the maximum profit if a better profit is found
          }
      }
  
      return maxProfit;
      }

}
