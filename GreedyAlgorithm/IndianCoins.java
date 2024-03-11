package Vansh.GreedyAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class IndianCoins {
    public static void main(String[] args) {
        int arr[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int value = 1059;
        System.out.println();
        System.out.println("Minimum coins we need to make " + value + " is " + findMinCoins(arr, value).size() + " and those coins are " + findMinCoins(arr, value));
    }

    static List findMinCoins(int arr[] , int value) {
        List<Integer> list = new ArrayList<>();
        for(int i=arr.length-1; i>=0; i--) {
            if(value == 0) break;
            while(value >= arr[i]) {
                value -= arr[i];
                list.add(arr[i]);
            }
        }
        return list;
    }
}
