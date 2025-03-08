public class swap {
    public static void main(String[] args) {
        int a=10, b=5;
        System.out.println(a + " " + b);
        b += a;
        a = b-a;
        b -= a;
        System.out.println(a + " " + b);
    }
}
