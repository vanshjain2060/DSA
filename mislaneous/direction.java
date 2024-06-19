package Vansh.mislaneous;

public class direction {
    static int isPossible(int n, int m, String s){
        // code here 
        int currCol=0 , currRow=0 , minRow=0 , maxRow=0 , minCol=0 , maxCol =0;
        for(int i=0 ; i<s.length(); i++) {
            char ch = s.charAt(i);
            
            if(ch == 'L') {
                currCol--;
            }
            else if(ch == 'R') {
                currCol++;
            }
            else if(ch == 'D') {
                currRow--;    
            }
            else if(ch == 'U') {
                currRow++;
            }
            else{
                continue;
            }
        
            minRow =Math.min(minRow , currRow);
            maxRow =Math.max(maxRow , currRow);
            minCol =Math.min(minCol , currCol);
            maxCol =Math.max(maxCol , currCol);
        }
        
        return ((maxRow-minRow)<n) && ((maxCol-minCol)<m) ? 1:0;
    }
    
}
