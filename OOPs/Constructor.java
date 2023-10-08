package Vansh.OOPs;

public class Constructor {
    public static void main(String[] args) {
      Students s1 = new Students();
      s1.name = "VANSH JAIN";
      System.out.println(s1.name);
    }
}

class Students {
  String name;
  int roll;

  Students() {
    System.out.println("Constructor is called ");
    //this.name = name;
  }
}
