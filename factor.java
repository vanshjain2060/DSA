package DSA.Math;

public class factor {
    public static void main(String[] args) {
        // fact(20);
        fact2(20);
    }

    // Time Complexity will be O(n)
    static void fact(int n) {
        for(int i=1; i<=n+1; i++) {
            if(n%i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }


    // Time Complexity will be O(sqrt of n)
    static void fact2(int n) {
        for(int i=1; i<= Math.sqrt(n); i++) {
            if(n%i == 0) {
                if(n%i == i) {
                    System.out.print(i + " ");
                }else {
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }
    }


}
