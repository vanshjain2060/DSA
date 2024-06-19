package Vansh.Arrays;

import java.util.Scanner;

public class input_output {
public static void main(String[] args) {
    int marks[] = new int[100];
   try (Scanner sc = new Scanner(System.in)) {
    //int phy = sc.nextInt();   
    marks[0]= sc.nextInt(); //phy
    marks[1]= sc.nextInt(); //chem
    marks[2]= sc.nextInt(); //math
}
    System.out.println("phy : " + marks[0]);
    System.out.println("chem : " + marks[1]); 
    System.out.println("math : " +marks[2]);     
     
    int perc = (marks[0]+marks[1]+marks[2])/3;
    System.out.println("percentage = "+perc +"%");
    System.out.println("length of array = "+marks.length);
}
}
