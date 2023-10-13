
public class Main {
    public static void main(String[] args) {
        
        
		// Question 1 = print name 5 times
		// Question 2 = print num 1 to n
		// Question 3 = print num from n to 1
		// Question 4 = print num 1 to n in backtracking
		// Question 5 = print num n to 1 in back tracking

        //--------------------------------------Phase II --------------------------------

               // Question 6 = sum of 1st n numbers
               // Question 7 = factorial 
   	       // Question 8 =fibonacci
      	       // Question 9 = reverse an array 
     	       // Question 10 = palindrome 
         

		
      //   Q1(100);
      //   Q2(5,0); 
      //   Q3(5);
      //   Q4(5);
      //   Q5(5,0);

      //   Q6(50,0);

      //   Q7(10);
      //   System.out.println(Q8(40));

     // int[] arr = {2,45,6,7,8,9};
     // Q9(arr,6);

     //Q10
     String s = "Race a Car";
     System.out.println(Q10(0,s));
     

     


    }
    static void Q1(int n) {
		 
        if(n<1)return ;//base c

        System.out.println("mochi Gandu");

        Q1(n-1);//recursive c
   }

    static void Q2(int n, int a){   //(n,i)
        
        if(n<1)return;              //(i>n)
        a++;                        //sout(i)
        System.out.print(a);
        Q2(n-1,a);                  //Q(i+1,n)

   }

    static void Q3(int n){

        if(n<1)return;
        System.out.print(n);
        Q3(n-1);

   }

    static void Q4(int n){

        if(n<1)return;
        Q4(n-1);
        System.out.print(n);
        
       
   }

    static void Q5(int n,int a){

        if(n<1)return;
        a++;
        Q5(n-1,a);
        System.out.print(a);

   }


    static void Q6(int n,int sum){

     if(n<1) {
        System.out.println(sum);
        return;
     } 
     sum = sum + n;                     //
     
     Q6(n-1,sum);                       //(n-1, sum+n)
    
   }
   
    static int Q7(int n){

        if(n<1){
            return 1;
        }
        return n * Q8(n-1);
    }    
   
    static int Q8(int n){

        if(n<=1) return n;

        return Q8(n-1) + Q8(n-2);
    }

    static void Q9(int[] arr, int n){
     
    reverseArray(arr,n);
   }
         
        static void printarray(int[] arr , int n){

            for(int i = 0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        }

        static void reverseArray(int[] arr, int n){

            int p1 = 0, p2 = n-1;
            while(p1<p2){
                int temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
            printarray(arr, n);

        }
    
    static boolean Q10(int i, String s){
            // Base Condition
            // If i exceeds half of the string, means all the elements 
            // are compared, we return true.
          
            s.toLowerCase();
            s.replace(" ", "");
            
        if(i>=s.length()/2) return true;

          // If start is not equal to end, not palindrome.
        if(s.charAt(i)!=s.charAt(s.length()-i -1)) return false;
          
        return Q10(i+1,s);

    }


}
  

