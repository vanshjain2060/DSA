// package Vansh.mislaneous;
// 
public class countBottles {
    public static void main(String[] args) {
        int count = 0;
        int empty =0 , numBottles=15, numExchange=4;
        while(empty >= numExchange || numBottles>0) {
            count++;
            numBottles--;
            empty++;
            if(empty >= numExchange) {
                numBottles++;
                empty -= numExchange;
            }
        }
        System.out.println(count);
    }
}
