package Vansh.mislaneous;
// import java.util.*;
public class charr {

    public static int dataTypes(String type) {
       
        if(type.equals("Integer")) return 4;
        else if(type == "Long") return 8;
        else if(type == "Float")  return 4;
        else if(type == "Double") return 8;
        return 1;
    }
    public static void main(String[] args) {
        // Write your code here
        // Scanner sc = new Scanner(System.in);
        System.out.println("enter ");
        System.out.println(dataTypes("Integer"));

        
        // String str[] = {Integer, Long, Float, Double, Character};

        // if(str == "Integer") System.out.println("4 bytes");
        // else if(str == "Long") System.out.println("8 bytes");
        // else if(str == "Float") System.out.println("4 bytes");
        // else if(str == "Double") System.out.println("8 bytes");
        // else if(str == "Character") System.out.println("1 bytes");
        
    }
}
