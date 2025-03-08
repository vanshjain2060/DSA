
 public class powerOf3 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(18));
        System.out.println(Integer.toString(18,3).matches("^10*$"));
    }
    public static boolean isPowerOfThree(int n) {
        if(n==0) return false;
        while(n%3 == 0) n/=3;
        return n==1?true:false;
    } }