package Vansh.Questions;

public class addBinary {
    public static void main(String[] args) {
        // System.out.println(gcd(4,9));
        // System.out.println(lcm(4, 9));
       String c = addBin("1010", "1011");
        for(int i=0; i<c.length(); i++) {
            System.out.print(c.charAt(i));
        }
    }



        public static String addBin(String a, String b) {
            StringBuilder sb = new StringBuilder();
            int carry=0;
            int x = a.length()-1;
            int y = b.length()-1;
            while(x>=0 || y>=0 || carry==1) {
                if(x>=0) {
                    carry += a.charAt(x--) - '0';
                } 
                if(y>=0) {
                    carry += b.charAt(y--) - '0';
                } 
                sb.append(carry % 2);
                carry /= 2;
            }
            return sb.reverse().toString();
        }
    

}

