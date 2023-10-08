package Vansh.Pattern;
class Print_INVERTED_STAR_Pattern {
    public static void main(String[] args) {
     int n=4;
    for(int line=1; line<=n;line++){
    for(int star=1;star<=(n+1-line);star++){
        System.out.print("* ");
    }
    System.out.println();
 }
    
    }
        }
