package Vansh.Recursion;

public class PrintDigitToWords {
    public static void Printletters(int number){
        String digit[] = {"zero" , "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine"};
        // Base Case 
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        Printletters(number/10);
        System.out.print(digit[lastDigit] + " ");
    }
    public static void main(String[] args) {
        Printletters(19470);
    }
}
