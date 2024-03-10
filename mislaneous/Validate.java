package Vansh.mislaneous;

public class Validate {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {5,4,3,2,1};
        System.out.println(validateStackSequences(arr1, arr2));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = popped.length;
        for(int i=0; i<n; i++) {
            if(pushed[i] != popped[n-1-i]) return false;
        }
        return true;
    }
}
