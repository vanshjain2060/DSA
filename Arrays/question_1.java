package Vansh.Arrays; 
public class question_1 {
 public static boolean true_false(int nums[]){
    for(int i =0; i<nums.length; i++){
         for(int j=i+1;j<nums.length ;j++){
            if(nums[i] == nums[j]){
              return true;
           } 
          } 
         }
            return false;
       }
    
  /*   for(int i=0;i<nums.length;i++){
        for(int j=i+1;j<nums.length;j++){
            if(  nums[i]==nums[j])
            return true;
        }
    }
    return false;
}*/
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        System.err.println(true_false(nums));
    }}

