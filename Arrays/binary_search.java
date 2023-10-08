package Vansh.Arrays;

public class binary_search {
    public static int binSearch(int numbers[],int key){
       int start=0;
       int end=numbers.length;
        for(int i =0;i<numbers.length;i++){
            int mid = (start+end)/2;

            // comparing
            if(numbers[mid]==key){
                return mid;
            }

            if(numbers[mid]<key){
                start=mid+1;
            }

            else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={2,4,6,7,8,10,12,14};
        int key =10;
        
        int a = binSearch(numbers, key);
         if(a==-1){
            System.out.println("NOT FOUND");
         }
         else{
            System.out.println("key is in index : "+a);
         }
    }
}
