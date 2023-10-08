package Vansh.Strings;
// jis bhee program ko string se solve karte hai unko stringbulider se bhee kar sakte hai
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a'; ch<='z'; ch++) {
            sb.append(ch);
        } //abcdefghijklmnopqrstuvwxyz

        System.out.println(sb);
    }
}
// " append " sunction ka use karke hamne string ke end 
// me characters ko add kiya hai .
// is case me time complexity O(26)
// agar string le lete to O(n^2) hoti jo worst hai