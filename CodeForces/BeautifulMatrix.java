import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mat = new int[5][5];
        
        int x = -1, y = -1;
        
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                mat[i][j] = sc.nextInt();
                if(mat[i][j] == 1) {
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println(Math.abs(2 - x) + Math.abs(2 - y));
        sc.close();
    }
}