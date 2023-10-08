package Vansh.Arrays;

public class print_subArrays {
    public static void printsubarrays(int numbers[]){
      int totalSubarrays=0;
        for(int i =0;i<numbers.length;i++){
             int start =i;
            for(int j=i; j<numbers.length; j++){
                int end =j;
                for(int k=start; k<=end; k++){
                    System.out.print(numbers[k] +" " );
                } totalSubarrays++;
                 System.out.println();
            } System.out.println();
        }System.out.print("total subarrays = "+ totalSubarrays);
    }

    public static void sumofsubarray(int numbers[]) {
       int sum=0;
        for(int i =0; i<=numbers.length; i++){
        int start=i;
            for(int j=i; j<=numbers.length; j++){
                int end=j;
            sum=0;
                for(int k=start; k<=end; k++){
                sum+= numbers[k];
                }
                 System.out.println("sum is = " + sum );
            } // System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={2, 4, 6, 8, 10};
        printsubarrays(numbers);
        System.out.println();
        System.out.println();
        sumofsubarray(numbers);
    }
}
