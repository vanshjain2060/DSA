package Vansh.Arrays;

public class pairs {
    public static void printPairs(int numbers[]){
     int tp=0;
        for(int i=0 ;i<numbers.length;i++ ){
        //  int start=numbers[i];
         for(int j=i+1;j<numbers.length;j++){
            // int end=numbers[j];
             System.out.print("("+ numbers[i] +"," + numbers[j] +") ");
            tp++; // there is also a  formula to find total pair 
                  // that is (n[n-1])/2
         }
          System.out.println();
      }System.out.println("total pairs = "+tp );
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printPairs(numbers);
        }
    }

