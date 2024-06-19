package Vansh.OOPs;

public class StaticKeyword {
    public static void main(String[] args) {
    //     Studentt s1 = new Studentt();
    //     s1.schoolName = "DPS";

    //     Studentt s2 = new Studentt();
    //     System.out.println(s2.schoolName);

    //     Studentt s3 = new Studentt();
    //     s3.schoolName = "ABC";
    }
   
}

class Studentt {
    int returnPercentage(int math, int phy, int chem) {
        return (math+phy+chem)/3;
    }
    String name;
    int roll;

    static String schoolName;

    void setName(String name) {
        this.name=name;
    }
    String getName() {
        return this.name;
    }
}