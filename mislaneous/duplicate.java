package Vansh.mislaneous;

public class duplicate {
    
    public static int removeDuplicates1(int[] nums) {
        int numss[] = new int[nums.length];
        numss[0] = nums[0];
        int count = 0;
        for(int i=1; i<nums.length; i++) {
            if(numss[i-1] != nums[i]) {
                numss[i] = nums[i];
                count++;
            }
        }
        //  for (int ij=0; ij<numss.length; ij++) {
        //     System.out.print(numss[ij] + " ");
        // }
        return  count;
    }

    public static int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
        
    }

    public static void main(String[] args) {
        int nums[] = {0,0,1,1,1,2,2,3,4,4,5};
        System.out.println(removeDuplicates1(nums));
       
        
    }

}
