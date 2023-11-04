package Vansh.DivideConcure;

public class searchInRotated {
     static int search(int arr[] , int target , int s, int e){
        if(s>e) return -1;

        int m = s+(e-s)/2;

        if(arr[m] == target) return m;

        if(arr[s]<=arr[m]){
            if(target <= arr[m] && target >=arr[s]) return search(arr, target, s, m-1);

            else return search(arr, target, m+1, e);
        }
        else{
            if(target>= arr[m] && target<=arr[e]) return search(arr, target, m+1, e);

            else return search(arr, target, s, m+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,6,7,8,9,1,2,3,4};
        System.out.println(search(arr,9 , 0, arr.length-1));
    }
}
