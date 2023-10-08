package Vansh.Recursion;

public class countZero {
    static int count(int n , int i){
        if(n == 0) return i; 
        else if(n%10 == 0) return count(n/10, i+1);
        else return count(n/10, i);
    }
    public static void main(String[] args) {
        System.out.println(count(30204, 0));
    }
}
