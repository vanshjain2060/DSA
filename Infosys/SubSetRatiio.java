import java.util.*;

public class SubSetRatiio {
    public static void main(String[] args) {
        System.out.println(getCountOfSubSetsWithRatioK(new int[] { 1, 3, 9, 9, 27, 81 }, 3));
    }

    static Map<String, Integer> dp;
    private static int getCountOfSubSetsWithRatioK(int[] arr, int k) {
        dp = new HashMap<>();
        return helper(0, arr, new ArrayList<>(), k);
    }

    private static int helper(int i, int[] arr, List<Integer> curr, int k) {
        if (curr.size() == 3) {
            System.out.println(curr);
            return 1;
        }
        if (i >= arr.length) return 0;

        String key = i + "," + curr.size() + "," + (curr.size() == 0 ? -1 : curr.get(curr.size()-1));
        if (dp.containsKey(key)) return dp.get(key);

        int ans = 0;
        // Not Take
        ans += helper(i + 1, arr, curr, k);
        // Take call 3 cases
        if (curr.size() == 0 ||
                (curr.size() == 1 && k * curr.get(curr.size() - 1) == arr[i]) ||
                (curr.size() == 2 && k * curr.get(curr.size() - 1) == arr[i])) {
            curr.add(arr[i]);
            ans += helper(i + 1, arr, curr, k);
            curr.remove(curr.size() - 1);
        }
        dp.put(key, ans);
        return ans;
    }
}
