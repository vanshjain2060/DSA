package Vansh.FunctionsandMethods;

public class binaryToDecimal {
    public static void binToDec(int BinNum){
        int pow =0;
        int DecNum =0;
        int myNum =BinNum;
        while(BinNum > 0){
            int lastDigit = BinNum % 10;
            DecNum = DecNum + (lastDigit*(int)Math.pow(2,pow));
            pow++;
            BinNum=BinNum/10;
        } System.out.println("decimal of "+ myNum +" = " + DecNum);
    }
    public static void main(String[] args) {
        binToDec(1010);
    }
}
