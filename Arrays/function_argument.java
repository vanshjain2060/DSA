package Vansh.Arrays;

public class function_argument {
    public static void update(int marks[] ,int unchangeable){
        unchangeable=10;
        for(int  i =0;i<marks.length;i++){
            marks[i] = marks[i] +1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {97 ,98 ,99};
        int unchangeable=5; 
        update(marks,unchangeable);
         System.out.println(unchangeable);
          // for printing updated marks
          for(int i =0;i<marks.length;i++){
           System.out.println(marks[i] +" ");
          }
          
    }
}
