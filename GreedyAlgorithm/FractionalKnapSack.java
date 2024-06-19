package Vansh.GreedyAlgorithm;
import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String[] args) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int capacity = 50;
        int w = capacity;
        int finalVal = 0;
        // creating 2D array to store the index and their ratio 
        // more the ratio maxTotalValue then we sort the array with respect to the retio

        double ratio[][] = new double[value.length][2];
        for(int i=0; i<value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (value[i]/(double)weight[i]);
        }

        Arrays.sort(ratio ,Comparator.comparingDouble(o -> o[1]));
        for(int i=ratio.length-1; i>=0; i--) {
            int index = (int)ratio[i][0];
            if(capacity >= weight[index]) {
                finalVal += value[index];
                capacity -= weight[index];
            }else {
                finalVal += (int)ratio[i][1] * capacity;
                capacity = 0;
                break;
            }
        }
        System.out.println("Maximum Value can be Achieved with weight capacity " + w + " is = " + finalVal);
    }
}
