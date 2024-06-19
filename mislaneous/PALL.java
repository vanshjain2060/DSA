package Vansh.mislaneous;

public class PALL {
    public static void main(String[] args) {
        System.out.println(tf("racecar"));
    }

    private static boolean tf(String string) {
        for(int i=0; i<string.length()/2; i++) {
            if(string.charAt(i) != string.charAt(string.length()-i-1)) return false;
        }
        return true;
    }
}
