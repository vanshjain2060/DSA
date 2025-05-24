public class MaxSumNodeValues {

    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long maxTotalSum = 0;
        int nodesChosenToXorCount = 0;
        long minSacrificeToFixParity = Long.MAX_VALUE;

        for (int i=0; i<nums.length; i++) {
            int num = nums[i];
            long val_orig = num;
            long val_xor = (long)num ^ k;

            if (val_xor > val_orig) {
                maxTotalSum += val_xor;
                nodesChosenToXorCount++;
            } else {
                maxTotalSum += val_orig;
            }
            minSacrificeToFixParity = Math.min(minSacrificeToFixParity, Math.abs(val_orig - val_xor));
        }

        if (nodesChosenToXorCount % 2 != 0) {
            maxTotalSum -= minSacrificeToFixParity;
        }

        return maxTotalSum;
    }

    public static void main(String[] args) {
        MaxSumNodeValues solution = new MaxSumNodeValues();

        int[] nums1 = {1, 2, 1};
        int k1 = 3;
        int[][] edges1 = {{0, 1}, {0, 2}};
        System.out.println("Example 1 Output: " + solution.maximumValueSum(nums1, k1, edges1));

        int[] nums2 = {2, 3};
        int k2 = 7;
        int[][] edges2 = {{0, 1}};
        System.out.println("Example 2 Output: " + solution.maximumValueSum(nums2, k2, edges2));

        int[] nums3 = {7, 7, 7, 7, 7, 7};
        int k3 = 3;
        int[][] edges3 = {{0, 1}, {0, 2}, {0, 3}, {0, 4}, {0, 5}};
        System.out.println("Example 3 Output: " + solution.maximumValueSum(nums3, k3, edges3));
        
        int[] nums4 = {24,78,1,97,44};
        int k4 = 6;
        int[][] edges4 = {{0,2},{1,2},{4,2},{3,4}};
        System.out.println("Example 4 Output: " + solution.maximumValueSum(nums4, k4, edges4));

        int[] nums5 = {1,0,0};
        int k5 = 1;
        int[][] edges5 = {{0,1},{1,2}};
        System.out.println("Example 5 Output: " + solution.maximumValueSum(nums5, k5, edges5));

        int[] nums6 = {4,8,2};
        int k6 = 1;
        int[][] edges6 = {{0,1},{1,2}};
        System.out.println("Example 6 Output: " + solution.maximumValueSum(nums6, k6, edges6));
    }
}
