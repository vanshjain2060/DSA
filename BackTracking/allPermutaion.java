
public class allPermutaion {

    static void Permutaion(String str , String ans) {
        // base case
        if(0 == str.length()) {
            System.out.print(ans + " ");
            return;
        }
        // recursion
        for(int i=0 ; i<str.length() ; i++) {
            char curr = str.charAt(i);
            // to remove the character of ith place form the string 
            String str1 = str.substring(0,i) +str.substring(i+1);
            Permutaion(str1, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc" ;
        Permutaion(str, "");
        System.out.println();
        Permutaion(str, "", new boolean[str.length()]);
    }

    private static void Permutaion(String s, String curr, boolean[] used) {
        if(curr.length() == s.length()) {
            System.out.print(curr + " ");
            return;
        }

        for(int i=0; i<s.length(); i++) {
            if(used[i]) continue;

            used[i] = true;

            Permutaion(s, curr+s.charAt(i), used);

            used[i] = false;
        }
    }
}
