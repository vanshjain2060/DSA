package Vansh.mislaneous;

class linearsearch {
    public static void main(String[] args) {
    int[] arr={1,3,45,22,13};
    int target=45;
    System.out.println(find(arr,target,0));
    System.out.println(findindex(arr,target,0));
    }
    static boolean find(int[] arr, int target,int index){
        if(index== arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
   static int findindex(int[] arr,  int target, int index){
    if(index== arr.length){
        return -1;
    }
     if (arr[index]==target)
     return index;
     else
     return findindex(arr,target,index+1);
}
   }

