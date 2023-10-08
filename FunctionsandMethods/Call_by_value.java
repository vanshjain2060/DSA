package Vansh.FunctionsandMethods;

public class Call_by_value {
    // swap
    public static void swap(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a is "+ a);  //yeh print statement main me nhi hai is liye value is funnction
        System.out.println("b is "+ b);  // ke heesab se change hogi and swap value print hogi
        return;
    }
    public static void main(String[] args) {
        int a =5;
        int b =10;
        swap(a, b);
       // agar print statement main me likha hota to 'a' & 'b' ki value me koee change nhi hota
   }
}
