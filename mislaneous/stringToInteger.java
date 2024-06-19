package Vansh.mislaneous;

public class stringToInteger {
   public static void main(String[] args) {
    String num1="30";
    String num2 = "14";
    System.out.println(multi(num1, num2));
   }

    public static String multi(String num1, String num2) {
        int a =0, b=0;
        for(int i=num1.length()-1, po=0; i>=0; i--) {
            a += (num1.charAt(i) - 48)* (Math.pow(10, po++));
        }
        for(int i=num2.length()-1, po=0; i>=0; i--) {
            b += (num2.charAt(i) - 48)* (Math.pow(10, po++));
        }
        int ans = a*b;
        
        return String.valueOf(ans);



        // int n1=Integer.parseInt(num1);
        // int n2=Integer.parseInt(num2);
        // int ans = n1*n2;
        // String result = String.valueOf(ans);
        // return result;
    }
}
