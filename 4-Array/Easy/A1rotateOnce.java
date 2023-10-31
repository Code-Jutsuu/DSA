

public class A1rotateOnce {
    public static void main(String[] args) {
        int arr[]= {5,6,7,8,9,1,};
        rotation(arr); 
        
        
    }
    public static void rotation(int[] arr) {
        int temp = arr[0];
        for(int i = 0; i<arr.length-1; i++){
            arr[i] = arr[i+1];
          
        }
           arr[arr.length-1] = temp; ;
           for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
    }
    }
}
