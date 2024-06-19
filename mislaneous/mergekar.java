package Vansh.mislaneous;

public class mergekar {
    
    static void printAr(int arr[]){
        for(int i=0 ; i<arr.length ;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void ms(int arr[] , int s , int e){
        if(s>=e) return ;
        int m = s +(e-s)/2;
        ms(arr, s, m);
        ms(arr, m+1, e);
        mm(arr, s, m, e);
    }

    static void mm(int arr[] , int s , int m , int e){
        int[] temp = new int[e-s+1];
        int i = s;
        int j = m+1;
        int k = 0;
       
        while(i<=m && j<=e){
            temp[k++]= arr[i]<arr[j]? arr[i++] : arr[j++];
        }

        while(i<=m) temp[k++] = arr[i++];
        
        while(j<=e) temp[k++] = arr[j++];

        for(k=0 ,i=s ;k<temp.length;k++ ,i++){
            arr[i] = temp[k];
        }
        
    }

    public static void main(String[] args) {
        int[] arr = {2,6,5,9,12,3,0,1};
        ms(arr, 0, arr.length-1);
        printAr(arr);
        
    }
}
