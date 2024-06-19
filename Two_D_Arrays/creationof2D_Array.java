package Vansh.Two_D_Arrays;

import java.util.Scanner;
public class creationof2D_Array {

      // to find cell number of the key 
    public static boolean Search(int matrix[][] , int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell (" + i +"," + j +")");
                    return true;
                }
            }
        }
            System.out.println("key not found ");
        return false;
    }
    
     //  to printing smallest and largest of all
    public static int printLargest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] > largest){
                    largest = matrix[i][j];
                }
                if(matrix[i][j] < smallest){
                    smallest = matrix[i][j];
                }   
            }
        }System.out.println("smallest number is = " +smallest);
            return largest ;
    }
    public static void main(String[] args) {
      int matrix[][] = new int [3][3];
      int n = matrix.length, m = matrix[0].length;
    
      // Intput
     System.out.println("Enter your numbers");

     try (Scanner sc = new Scanner(System.in)) {
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
            matrix[i][j] = sc.nextInt();
            }
        }
    }
    //Output
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
    }
    int key=9;
     Search(matrix , key);
    System.out.println("largest number is = " + printLargest(matrix));   
    }
}
