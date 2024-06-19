package Vansh.Questions;

public class BInSearchSQRT {
    public static void main(String[] args) {
        int n=40;
        int p =3;  // here p is precision
        System.out.printf("%.3f" ,sqrt(n,p));
    }
 static int t =0;
// Time Complexity will be O(log(n))
    private static double sqrt(int n, int p) {
        int s=0;
        int e=n;
        double root = 0.0;

        while(s<=e) {

            System.out.println(t++ + " " + root);
            int m = s+(e-s) /2;
            if(m*m == n) {
                return m;
            }
            else if(m*m < n) {
                s = m+1;
            }
            else {
                e = m-1;
            }

            double increment = 0.1;
            for(int i=0; i<p; i++) {
                while(root*root <= n) {
                    root += increment;
                }

                root -= increment;
                increment /= 10;
            }
        }
        return root;
    }
}
