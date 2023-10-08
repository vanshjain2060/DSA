package Vansh.FunctionsandMethods;

public class Syntax_Function_Code {
    public static void printHW() {   //agar void nhi hoga kuch or hoga to return likhna jaruri hota hai 
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        return ;    //void ke case me return nhi likhenge to bhee kam chal jayega
    }
    public static void main(String[] args) {
        printHW();      // calling  Function
    }
}
 /*
  Syntax is 

  returnType name(){
    body
 return statement;
  } 
 */