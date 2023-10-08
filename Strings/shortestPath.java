package Vansh.Strings;

// import java.util.Scanner;

public class shortestPath {
    public static float getShortestPath(String path){
        int x=0 , y=0;
        for(int i=0; i<path.length(); i++){
            char dir = path.charAt(i);

            // for north direction
            if(dir == 'N'){
                y++;
            }
            // for south direction
            else if(dir == 'S'){
                y--;
            }
            // for east direction
            else if(dir == 'E'){
                x++;
            }
            // for west direction
            else{
                x--;
            }
        }
        
        int X = x*x ,Y = y*y;
        return (float)Math.sqrt(X+Y);
    }

    public static void main(String[] args) {
        // System.out.println("Enter your directions here");
        // try (Scanner sc = new Scanner(System.in)) {
        //   String path = sc.nextLine();
        String path ="WNES";
            System.out.println(getShortestPath(path));
        }
}

