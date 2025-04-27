public class FixedBoundSubarrays {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 7, 5};
        int minK = 1;
        int maxK = 5;

        long result = countSubarrays(nums, minK, maxK);
        System.out.println("Number of fixed-bound subarrays: " + result);
    }

    public static long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        int lastMin = -1, lastMax = -1, lastInvalid = -1;

        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];

            if (val < minK || val > maxK) {
                lastInvalid = i;
            }
            if (val == minK) {
                lastMin = i;
            }
            if (val == maxK) {
                lastMax = i;
            }

            int validStart = Math.min(lastMin, lastMax);
            if (validStart > lastInvalid) {
                count += validStart - lastInvalid;
            }
        }

        return count;
    }
}