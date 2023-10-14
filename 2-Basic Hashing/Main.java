import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        
        //Hashing is a process of converting input data (of any size) into a fixed-length string of characters
        // or numerical value, using a specific algorithm known as a hash function.
        
           int arr[] = {2,4,5,6,1,6,1,5,3};
        

        // int maxElement = 100;
        // int frequencyArr[] = new int[maxElement];

        // for(int num : arr){
        //     frequencyArr[num]++;
        // };

        // for(int i = 0; i<=frequencyArr.length-1; i++){
        //     if(frequencyArr[i] > 0){
        //          System.out.println("Element "+i+" occurs "+frequencyArr[i]+" times.");
        //         }
           
        // }

         // Create a HashMap to store element frequencies
         HashMap<Integer, Integer> frequencyMap = new HashMap<>();

         // Loop through the array and update the frequency map
         for (int num : arr) {
             frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
         }

         // Display the frequency of each element
         for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
             System.out.println("Element " + entry.getKey() + " occurs " + entry.getValue() + " times.");
         }

      

        //

        int maxElements = 100;
        int occur[] = new int[maxElements];

        for(int nums : arr){
            occur[nums]++;
        }
        
        for(int i =0; i<=arr.length -1; i++){
            if(occur[i]>0){
                System.out.println(i +" occur "+ occur[i]+ " times");
            }
        }
        
    }

}

  /*
      * HashMap Method:

             Optimized when the range of elements is not known in advance or is very large.
             Suitable for cases where you have sparse data, meaning that not all possible elements
             within a large range are present in the array.
             HashMap has an O(1) average time complexity for insertion and retrieval of values, 
             making it efficient for most practical scenarios.
    
         Array Method:

             Optimized when you have prior knowledge of the range of elements and it is relatively small.
             More memory-efficient than a HashMap, especially when dealing with a small range.
             The array method has a time complexity of O(n) for counting frequencies, 
             where n is the size of the array. If the range of elements is reasonably small,
             this method can be more efficient in terms of both time and space.

           In summary, the HashMap method is generally more versatile and efficient when you have a large or
           unknown range of elements. However, if you know that the range of elements is small and can
           fit comfortably into an array, the array method can be more memory-efficient and performant
           for your specific use case.
         */
