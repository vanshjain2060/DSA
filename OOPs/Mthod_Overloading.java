package Vansh.OOPs;

public class Mthod_Overloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 5));
        System.out.println(calc.sum(2.7f, 6.1f));
        System.out.println(calc.sum(2, 5, 6));
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}