package Vansh.Arrays;

public class question_2 {
    public static int findIndex(int nums[] , int target){
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == target){
                int index = i ;
           return index;
        }  }
    return -1;
} 
       public static void main(String[] args) {
        int nums[]= {4,5,6,7,0,1,2};
        int target = 0 ;
        int a = findIndex(nums, target);
        if(a==-1){
            System.out.print("-1");
        }
        else{
            System.out.println(a);
        }
    }
}
