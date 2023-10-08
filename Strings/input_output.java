package Vansh.Strings;

// import java.util.Scanner;

public class input_output {

  // String char At method

  public static void printLetters(String fullName){
    for(int i=0; i<fullName.length(); i++){
      System.out.print(fullName.charAt(i) + " ");
    }
    System.out.println();
  }
    public static void main(String[] args) {

/*        char arr[] ={'a' , 'b' , 'c' , 'd'};
        String str = "abcd";
        String str2 = new String("xyz@1234");
*/
    
        // string are " Immutable"
/* 
        try (Scanner sc = new Scanner(System.in)) {
         String name;
           name = sc.nextLine();
           System.out.println(name);
        }
 */        
        

        // To find the length of the String
/* 
         String fullName = "Tony Stark";
         System.out.println(fullName.length());
*/
         // Concatination [it basically mean joining more than 1 thing using '+' sign]
         String firstName = "Vansh";
         String lastName = "Jain";
         String fullName = firstName + " " + lastName;
         //System.out.println(fullName);

         printLetters(fullName);
    }
}
// Is code me 5 different things ko explain kiya gya hai 
// 2 min ke ke videos hai kuch samajh na aee to dekhle
