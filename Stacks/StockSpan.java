package Vansh.Stacks;

import java.util.*;
public class StockSpan {

    // static void stockSpan(int stocks[] , int span[]) {
    //     Stack<Integer> s = new Stack<>();
    //     span[0] = 1;
    //     s.push(0);
    //     for(int i=1; i<stocks.length; i++) {
    //         int currPrice = stocks[i];
    //         while(!s.isEmpty() && currPrice >= stocks[s.peek()]) {
    //             s.pop();
    //         }
    //         if(s.isEmpty()) span[i] = i+1;
    //         else {
    //             int prevHigh = s.peek();
    //             span[i] = i - prevHigh;
    //         }
    //         s.push(i);
    //     }
    // }

   
    public static void main(String[] args) {
        int stocks[] = {100, 80, 60, 70, 60, 85, 100};
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for(int i=0; i<span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    private static void stockSpan(int[] stocks, int[] span) {
        Stack<Integer> s = new Stack<>();
        // span[0] = 1;
        // s.push(0); then loop will starts from 0 other wise it begins from 1
        for(int i=0; i<stocks.length; i++) {
            int currPrice = stocks[i];
            while(!s.isEmpty() && currPrice >= stocks[s.peek()]) s.pop();
            if(s.isEmpty()) span[i] = i+1;
            else span[i] = i-s.peek();  // since s.peek() will give the index of the prevHigh
            s.push(i);
        }
    }
}