package Vansh.GreedyAlgorithm;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class MaxActivity {
    public static void main(String[] args) {
        int start[] = {1, 3, 2, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        // SolutionOfNotEndSorted(start, end);
        // end time basis sorted
        int maxAct ;
        ArrayList<Integer> list = new ArrayList<>();

        // last Activity
        maxAct = 1;
        list.add(0);
        int lastEnd = end[0];
        for(int i=1; i<end.length; i++) {
            if(start[i] >= lastEnd) {
                maxAct++;
                list.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for(int i=0; i<list.size(); i++) {
            System.out.print("A"+list.get(i) + " ");
        }
        System.out.println(list);
    }

    
    // if the ending array is not sorted then we have to sort the ending array 
    public static void SolutionOfNotEndSorted(int start[] , int end[]) {
        // Sorting 
        int activities[][] = new int[start.length][3];
        for(int i=0; i<start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        } 
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        // this above line is called lambda function -> which decide the sorting logic
        // and now the sorting is done according the ending array which is stored it the 2nd Column
        int maxAct ;
        ArrayList<Integer> list = new ArrayList<>();

        // last Activity
        maxAct = 1;
        list.add(activities[0][0]);
        int lastEnd = activities[0][2];
        for(int i=1; i<end.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                list.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Max Activities = " + maxAct);
        for(int i=0; i<list.size(); i++) {
            System.out.print("A"+list.get(i) + " ");
        }
        System.out.println(list);

    } 
}
