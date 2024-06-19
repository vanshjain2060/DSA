package Vansh.OOPs;

public class TypesOfConstructor {
    public static void main(String[] args) {
        Students s1 = new Students();
        Students s2 = new Students("VANSH JAIN");
        Students s3 = new Students(799);
        
        System.out.println(s1);
        System.out.println(s2.name);
        System.out.println(s3.roll);
    }
}
 
  /*
    agar koee bhee constructor bnaya hai other then Non Parameterized Constructor
    to hamee usko liye java by default constructor (Non Parameterized Constructor)
    nhi deta hai hamee unko run karne ke liye default constructor bnana hoga 
  */

 class Students {
    String name;
    int roll;

// Non-Parameterized Constructor
    Students() {
   // System.out.println("Constructor is called...");
    }

// Parameterized Constructor
    Students(String name) {
        this.name=name;
    }

//Parameterized Constructor
    Students(int roll) {
        this.roll=roll;
    }
}

// Copy Constructor next file me hoga

