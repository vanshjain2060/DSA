
public class trappedWaterlevel {
    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // Calculate left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // Calculate right max boundary - array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappedWater = 0;
        // Loop
        for (int i = 0; i < n; i++) {
            // water level = min(leftmax boundary ,rightmax boudary)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);

            // traped water = waterLevel - hihght[i]
            trappedWater += (waterLevel - height[i]);

        }
        return trappedWater;

    }


    public static int trap(int[] height) {
        int n = height.length, leftMax = 0, rightMax = 0, low = 0, high = n - 1, count = 0;
        while(low <= high) {
            if(height[low] <= height[high]) {
                leftMax = Math.max(leftMax, height[low]);
                count += leftMax - height[low++];
            } else {
                rightMax = Math.max(rightMax, height[high]);
                count += rightMax - height[high--];
            }
        }
        return count;
    }


    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainwater(height));
        System.out.println(trap(height));
    }
}
