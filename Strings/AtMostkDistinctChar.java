import java.util.*;
public class AtMostkDistinctChar {
    public int kDistinctChar(String s, int k) {
        int n = s.length(), maxi = -1;
        int i=0, j=0;
        Map<Character, Integer> m = new HashMap<>();
        while(j < n) {
            m.put(s.charAt(j), m.getOrDefault(s.charAt(j),0)+1);
            while(m.size() > k) {
                m.put(s.charAt(i), m.get(s.charAt(i))-1);
                if(m.get(s.charAt(i)) == 0) m.remove(s.charAt(i));
                i++; 
            }
            maxi = Math.max(maxi, j-i+1);
            j++;
        }
        return maxi;
    }

    // test harness
    public static void main(String[] args) {
        String s = "aababbcaacc";
        int k = 2;
        AtMostkDistinctChar solver = new AtMostkDistinctChar();
        int result = solver.kDistinctChar(s, k);
        System.out.println(result);  // expected output: 6
    }
}