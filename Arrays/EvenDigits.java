package Vansh.Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int arr[] = {12,536,1758,5};
        System.out.println(numCount(8));
        System.out.println(even(8));
        System.out.println(findNumbers(arr));
    }

    public static int findNumbers(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(even(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static boolean even(int num) {
       int yesno = numCount(num);
       return yesno % 2==0;
    }
    

    public static int numCount(int num) {
        if(num<0) num=num*-1;
        if(num==0) return 1;
        int  j=0;
        while(num>0) {
            j++;
            num/=10;
        }
        return j;
    }
}
