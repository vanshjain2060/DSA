package Vansh.GreedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;


public class Chocola {
    public static void main(String[] args) {
        int n = 4 , m = 6; // these are peices  (n peices in a vertical column)  (m peices in a horizontal row)
        Integer verticalCost[] = {2, 1, 3, 1, 4}; // n-1 has to be less than 1 than peices
        Integer horizontalCost[] = {4, 1, 2};       // m-1 has to be less than 1 than peices

        // this will sort the array in decending order
        Arrays.sort(verticalCost , Collections.reverseOrder());
        Arrays.sort(horizontalCost , Collections.reverseOrder());

        int v=0;      // this will keep the track on vertical cost array
        int h=0;      // this will keep the track on hotrizontal cost array
        int verPieces=1;     // tracks number of vertical pieces
        int horPieces=1;     // tracks number of horizontal pieces
        int cost=0;   // hold the value of total cost

        while(h<horizontalCost.length && v<verticalCost.length) {
            if(verticalCost[v] <= horizontalCost[h]) { // means horizontal cut
                cost += (horizontalCost[h] * verPieces);
                horPieces++;
                h++;
            }else { // means vertical cut
                cost += (verticalCost[v] * horPieces);
                verPieces++;
                v++;
            }
        }
        while(v<verticalCost.length) {
            cost += (verticalCost[v] * horPieces);
            verPieces++;
            v++;
        }
        while(h<horizontalCost.length) {
            cost += (horizontalCost[h] * verPieces);
            horPieces++;
            h++;
        }
        System.out.println("Mimimum Cost to cut all the peices is = " + cost);
    }
}
