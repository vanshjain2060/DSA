// all the edge cases are covered
public class kadanes {
    public static int maxSUM(int arr[], int n) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static int kadaSum(int[] arr, int n) {
        int sum=0, maxi = Integer.MIN_VALUE;
        for(int i : arr) {
            sum = Math.max(sum + i, i);
            maxi = Math.max(maxi, sum);
        }
        return maxi;
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 1, -5, -4 };
        int n = arr.length;
        System.out.println(maxSUM(arr, n));
        System.out.println(kadaSum(arr, n));
    }
}
