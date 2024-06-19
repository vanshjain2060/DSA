package Vansh.mislaneous;
import java.util.*;

public class nextPermutation {
    
    static void next(int nums[]) {
       
        int m = nums.length;
        int bp = -1; // break point

        for(int i=m-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                bp = i;
                break;
            }
            
        }
       
        if (bp == -1) {
            for(int i=m-1; i>=0; i--) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
            return;
        }
        
        Arrays.sort(nums , bp+1 , m);

        for(int i=bp+1; i<m; i++) {  
            if(nums[bp] < nums[i] ) {
                int temp = nums[bp];
                nums[bp] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        
        for(int i=0; i<m; i++) {
            System.out.print(nums[i] + " ");
        }System.out.println();


    }

 public static void main(String args[]) {

        // to convert array into a Arraylist we use Arrays.asList
        int nums[] = {2,3,1};
        next(nums);
        // List<Integer> A = Arrays.asList(new Integer[] {3,2,1});
        // List<Integer> ans = nextGreaterPermutation(A);

        // System.out.println("The next permutation is: " + ans);

    }



    public static List< Integer > nextGreaterPermutation(List< Integer > A) {
        int n = A.size(); // size of the array.

        // Step 1: Find the break point:
        int bp = -1; // break point
        for(int i=0; i<n-2; i++) {
            if(A.get(i) < A.get(i+1)) {
                bp = i;
                break;
            }
        }

        // this is the edge case 
        // If break point does not exist:
        if (bp == -1) {
            // reverse the whole array:
            Collections.reverse(A);
            return A;
        }

       
        
        // Step 2: reverseSort the right half:
        List<Integer> sub = A.subList(bp + 1, n);
        Collections.sort(sub);
        

        // Step 3: Find the next greater element
        //         and swap it with arr[ind]:        
        for(int i=bp+1; i<n; i++) {  
            if(A.get(bp) < A.get(i) ) {
                int temp = A.get(bp);
                A.set(bp, A.get(i));
                A.set(i, temp);
                break;
            }
        }
        return A;
    }
}
