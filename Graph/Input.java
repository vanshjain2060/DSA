import java.util.*;
public class Input {
    public static void main(String[] args) {
        int[][] graph = {{ 1, 2 }, { 1, 3 }, { 2, 4 }, { 3, 4 }, { 2, 5 }, { 4, 5 }};
        int n = graph.length;

        // this is adjacency matrix representation
        int matrix[][] = new int[n+1][n+1];

        for(int[] temp : graph) {
            matrix[temp[0]][temp[1]] = 1;
            matrix[temp[1]][temp[0]] = 1;  // if it is directed graph then remove this line
        }
        for(int[] temp : matrix) {
            System.out.println(Arrays.toString(temp));
        }
        System.out.println();



        // this is adjacency list representation
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<=n; i++) {
            list.add(new ArrayList<>());
        }
        for(int[] temp : graph) {
            list.get(temp[0]).add(temp[1]);
            list.get(temp[1]).add(temp[0]); // if it is directed graph then remove this line
        }
        System.out.println(list);
    }

    public static ArrayList<ArrayList<Integer>> getGraph(int[][] graph) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0; i<=graph.length; i++) {
            list.add(new ArrayList<>());
        }
        for(int[] temp : graph) {
            list.get(temp[0]).add(temp[1]);
            list.get(temp[1]).add(temp[0]); // if it is directed graph then remove this line
        }
        return list;
    }
}
