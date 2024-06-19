package Vansh.Pattern_Advanced;
// [Logic] jab bhee ham koee pattern ko reverse karte hai to ham bas outer loop ko he change
// karte hai baki uske andar ka jo bhee code hoga usko disturbe nhi karenge 
public class diamond_pattern {
    public static void diamond(int n){
        for(int i=1;i<=n;i++){
           // this is part first 
            // for __
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            // for * 
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            // for __
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
        // this for second part ( in this we reverse the first part) 
        for(int i =n;i>=1;i--){
            // for __
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            // for * 
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("* ");
            }
            // for __
            for(int j=1;j<=(n-i);j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}
