package Vansh.Arrays;
// this is the most effective code
public class max_subarraySum_Kadanes {
    public static void printMaxsum(int numbers[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            currSum = currSum + numbers[i];
            if(currSum<0){
                currSum=0;
            }
               if(maxSum<currSum){
               maxSum=currSum;
             }
         }   
       System.out.println("our max sub array sum is = " + maxSum);
    }

    public static void main(String[] args) {
        int numbers[]={-2, 1, -3, 4, -1, 2 ,1, -5, 4};
       printMaxsum(numbers);
}
}