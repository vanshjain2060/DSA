package Vansh.Two_D_Arrays;

public class spiralMatrix {

   public static void printSpiral(int matrix[][]) {
    int startRow =0 ,
     startCol =0 , 
     endRow = matrix.length-1 ,
     endCol = matrix[0].length-1;

        while(startRow <= endRow && startCol <= endCol){

      // this is for top boundary
            for(int j =startCol; j<=endCol; j++){
               System.out.print(matrix[startRow][j]+" ");
            }
      // this is for right boundary
            for(int i=startRow +1; i<=endRow; i++){
               System.out.print(matrix[i][endCol]+" ");
            } 
      // this is for bottom boundary
            for(int j=endCol-1; j>=startCol; j--){
                
                // this is for an edge case
                if(startRow == endRow){
                    break;
                }
                
                System.out.print(matrix[endRow][j]+" ");
            }
      // this is for left boundary
            for(int i=endRow-1; i>=startRow+1; i--){
                
                // this is for an edge case
                if(startCol == endCol){
                    break;
                }

                System.out.print(matrix[i][startCol]+" ");
            }  
      // now updating our all the variables
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix [][] = { {1, 2, 3} ,
                            {9, 10, 11} ,
                            {13, 14, 15} };
        printSpiral(matrix);

    }
}
