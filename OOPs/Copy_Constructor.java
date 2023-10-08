package Vansh.OOPs;
/* q ki yeh sab same package me hai is liye 
 * ek bar koee name ka constructor ban gya to system usko
 * next file me bhee recognise kar rhaa hai isly 
 * har baar construcot ke name ki spelling differant use ki hai
 */
public class Copy_Constructor {
    public static void main(String[] args) {
        Studentss s1 = new Studentss();
        s1.name = "Vansh";
        s1.roll = 799;
        s1.password = "12345678vj";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Studentss s2 = new Studentss(s1); // Copy
        s2.password = "abcdefghij";
        System.out.println(s2.password);
         
         s1.marks[2] = 70;
        for(int i=0;i<3;i++) {
        System.out.println(s2.marks[i]);
        }
    }
}

class Studentss {
    String name;
    int roll;
    String password;
    int marks[]; 

/*// Shallow Copy Constructor [isme copy hone ke baad bhee change refelect hoga]
   
        Studentss(Studentss s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }
*/ 

    // Deep Copy Constructor [isme copy hone ke baad koee chaneg refelect nhi hoga]
        
        Studentss(Studentss s1) {
            marks = new int[3];
            this.name = s1.name;
            this.roll = s1.roll;
            for(int i=0;i<3;i++) {
                this.marks[i] = s1.marks[i];
            }
        }

    Studentss() {
        marks = new int[3];
   // System.out.println("Constructor is called...");
    }
    Studentss(String name) {
        marks = new int[3];
        this.name=name;
    }
    Studentss(int roll) {
        marks = new int[3];
        this.roll=roll;
    }
}