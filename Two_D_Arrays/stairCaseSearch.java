package Vansh.Two_D_Arrays;

import java.util.Arrays;

public class stairCaseSearch {
            
// This method can be used to solve "SORTED" 2D arrays
// jo array assending ya decending me sort nhi hoga usme yen method nhi lagega

    public static int[] stairSearch(int matrix[][] , int key) {
        int row =0 , col =matrix[0].length-1 ;
     
        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == key){
                return new int[]{row,col};
            }
            else if(key < matrix[row][col]){
                col-- ;
            }
            else{
                row++ ;
            }
        } 
        System.out.println("key not found");
        return new int[]{-1,-1};
    }
    public static void main(String args[]) {
        int matrix[][] = {{10, 20, 30, 40},
                          {15, 25, 35, 45},
                          {27, 29, 37, 48},
                          {32, 33, 39, 50}};
       int key = 27;
      System.out.println(Arrays.toString(stairSearch(matrix, key)));
      // to print the value of array Arrays.toString method is used which 
      //takes the input as array and print the array int the form oof list
    } 
}

   
        // Homework Question

// public static boolean stairSearch(int matrix[][] , int key) {
//     int row =matrix.length-1 , col =0 ;
 
//     while(row >=0 && col < matrix.length){

//         if(matrix[row][col] == key){
//             System.out.println( "forund the key at (" + row + "," + col + ")");
//                return true;
//         }
//         else if(key < matrix[row][col]){
//             row-- ;
//         }
//         else{
//             col++ ;
//         }
//     } 
//     System.out.println("key not found");
//     return false;
// }
// public static void main(String args[]) {
//     int matrix[][] = {{10, 20, 30, 40},
//                       {15, 25, 26, 45},
//                       {27, 29, 27, 48},
//                       {32, 33, 39, 50}};
//    int key = 48;
//    stairSearch(matrix, key);
// }
// }
