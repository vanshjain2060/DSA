package Vansh.Two_D_Arrays;

public class diagonalSum {
    
    public static int diagonalSumm(int matrix[][]){
        int sum = 0;

        //  By brute force method
      /* 
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(i == j){
                    sum+= matrix[i][j];
                }
                else if(i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
            }
        }
      */

        //  Optimized way
        
        for(int i=0; i<matrix.length; i++){
           // primary diagonal
           sum+= matrix[i][i];
           // Secondary diagonal
           if(i != matrix.length-1-i){
            sum+= matrix[i][matrix.length-1-i];
           }
        }
   return sum;
    }

    public static void main(String[] args) {
        int matrix [][] = { {1, 2, 3} ,
                            {9, 10, 11} ,
                            {13, 14, 15} };
        System.out.println(diagonalSumm(matrix));              
    }
}