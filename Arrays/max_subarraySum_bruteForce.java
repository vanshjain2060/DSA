package Vansh.Arrays;

public class max_subarraySum_bruteForce {
    public static void printMaxsum(int numbers[]){
     
 int maxSum=Integer.MIN_VALUE;
          for(int i =0;i<numbers.length;i++){
              int start =i;
              for(int j = i;j<numbers.length;j++){
                  int end =j; 
                    int currsum=0;
                  for(int k=start;k<=end;k++){
                     // subarray sum 
                        currsum += numbers[k];
                  } 
                  System.out.println(currsum);
                 
                   if(maxSum < currsum){
                   maxSum = currsum;
                }
              } 
           } 
          
          System.out.println("maxSum is = "+ maxSum);
     }
      public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printMaxsum(numbers);
      }
}
