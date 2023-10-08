package Vansh.Recursion;

public class findSingle {

    public static int find(int arr[]) {
        int ans=0;
        for(int i=0; i<arr.length; i++) {
            ans += arr[i]+ans;
        }
        return ans%3;
    }
    public static void main(String[] args) {
        int arr[] = {2,2,3,2,7,7,8,7,8,8};
        System.out.println(find(arr));
    }
}
