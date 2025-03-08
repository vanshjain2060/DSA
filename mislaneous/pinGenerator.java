public class pinGenerator {
    public static void main(String args[]) {
        int a=123, b=582, c=175;
        int maxi = 0;
        int ans = 0, pow = 1;
        while(a > 0) {
            int ar = a%10;
            int br = b%10;          
            int cr = c%10;
            maxi = Math.max(maxi, ar);
            maxi = Math.max(maxi, br);
            maxi = Math.max(maxi, cr);
            int mini = Math.min(ar, Math.min(br,cr));
            ans = (int) (ans == 0 ? mini : (mini*Math.pow(10, pow)) + ans);
        }
        ans = (int) ((maxi*Math.pow(10,pow)) + ans);
        System.out.println(ans);
    }
}