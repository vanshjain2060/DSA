public class lcm {
    public static void main(String[] args) {
        int a = 15, b=5;
        System.out.println(lcmOf(a, b));
        System.out.println(hcfOf(a, b));
        System.out.println(gcdOf(a, b));
    }
    
    public static int hcfOf(int a, int b) {
        while(a != b) {
            if(a>b) a-=b;
            else b-=a;
        }
        return a;
    }

    public static int lcmOf(int a, int b) {
        int i = 1;
        while(i <= b) {
            if(a*i % b == 0) return (a*i);
            i++;
        }
        return a*b;
    }

    public static int gcdOf(int a, int b) {
        int gcd = 1;
        int i = 1;
        int mini = Math.min(a, b);
        while(i <= mini) {
            if(a%i == 0 && b%i == 0) gcd = i;
            i++;
        }
        return gcd;
    }
}
    