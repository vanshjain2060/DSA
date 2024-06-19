package Vansh.BackTracking;


public class nQUEENS {
// this is for nights 
    // static boolean safe(char board[][] , int row, int col) {
        
    //     if(row-2>=0 && col-1>=0 ){
    //         if(board[row-2][col-1] == 'N') return false;
    //     }
    //     if(row-2>=0 && col+1<board.length) {
    //         if(board[row-2][col+1] == 'N') return false;
    //     }
    //     if(row-1>=0 && col-2>=0 ){
    //         if(board[row-1][col-2] == 'N') return false;
    //     }
    //     if(row+1<board.length && col-2>=0) {
    //         if(board[row+1][col-2] == 'N') return false;
    //     }
    //     if(row+1<board.length && col+2<board.length ){
    //         if(board[row+1][col+2] == 'N') return false;
    //     }
    //     if(row-1>=0 && col+2<board.length) {
    //         if(board[row-1][col+2] == 'N') return false;
    //     }
    //     // if(row+2<board.length && col-1>=0 ){
    //     //     if(board[row+2][col-1] == 'N') return false;
    //     // }
    //     // if(row+2<board.length && col+1<board.length) {
    //     //     if(board[row+2][col+1] == 'N') return false;
    //     // }

    //     return true;
    // }




// this is for queens
    static boolean isSafe(char board[][], int row, int col) {

        // check for vertical up
        for(int i=row-1; i>=0; i--) {
            if(board[i][col] == 'Q') return false;
        }

        // check for left up diagonal
        for(int i=row-1 ,j=col-1 ; i>=0 && j>=0 ; i--,j--){
            if(board[i][j]=='Q') return false;
        }

        // check for right up diagonal
        for(int i=row-1 ,j=col+1 ; i>=0 && j<board.length ; i--,j++) {
            if(board[i][j] == 'Q') return false;
        }

        return true;
    } 

    static int count=0;

    static void nQueens(char board[][] , int row) {
        // base
        if(row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        // loop for cloumn
        for(int j=0; j<board[0].length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row+1); 
                board[row][j] = 'o';
            }
        }
    }
    
    static void printBoard(char board[][]) {
        System.out.println("_________ Chess Board _________");
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        char board[][] = new char[n][n];
        // initialization
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = 'o';
            }
        }
        nQueens(board , 0);
        System.out.println();
        System.out.println("total number of ways to solve the n Queens = " + count);
        System.out.println();
        
    }
}
