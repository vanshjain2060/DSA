import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
        System.out.println();

        int[] nums = {1, 1, 2};
        Arrays.sort(nums); // Sort to handle duplicates
        List<List<Integer>> result = new ArrayList<>();
        permutationTwo(nums, new ArrayList<>(), result, new boolean[nums.length]);
        System.out.println(result);
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


    // this is when there are duplicates
    private static void permutationTwo(int[] nums, List<Integer> curr, List<List<Integer>> list, boolean[] used) {
        if (curr.size() == nums.length) {
            list.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])) continue;

            used[i] = true;

            curr.add(nums[i]);
            permutationTwo(nums, curr, list, used);
            curr.remove(curr.size() - 1);

            used[i] = false;
        }
    }
}
