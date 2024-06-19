package Vansh.Recursion;

public class friendsPairing {
    public static int pairing(int n){
        // Base Case 
        if(n == 1 || n ==0){
            return 1;
        }
        // Kaam
        int singleWays = 1 * pairing(n-1); // ways in single 
        int pairWays = (n-1)*pairing(n-2); // ways in pair 
        int totalWays = singleWays + pairWays;
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(pairing(13));
    }
}
