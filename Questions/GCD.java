public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(4,9));
        System.out.println(gcd1(4,9));
        System.out.println(lcm(4, 9));
    }

    static int gcd(int a, int b) {
        if(b==0) return a;
        return gcd(b, a%b);
    }

    static int gcd1(int a, int b) {
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a*b/gcd(a, b);
    }

}
