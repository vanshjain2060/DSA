import java.util.*;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int salt = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int drink = k*l;
        int lime = c*d;

        int ans = Math.min(drink / (nl * n) , Math.min(lime / n, salt / (np * n)));
        System.out.println(ans);
        sc.close();
    }    
}
