package Vansh.Arrays;
// this is the most effective code
public class max_subarraySum_Kadanes {
    public static void printMaxsum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            
               if(maxSum<currSum){
               maxSum=currSum;
             }
             if(currSum<0){
                currSum=0;
            }
         }   
       System.out.println("our max sub array sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={-2, -3, -1, -5, -4};
       printMaxsum(numbers);
}
}