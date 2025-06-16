import java.util.*;

public class InputHandler {

    // Method to handle single integer input
    public static int readSingleInteger(Scanner sc) {
        return sc.nextInt();
    }

    // Method to handle single line input with multiple integers (space-separated)
    public static int[] readIntegerArray(Scanner sc) {
        String line = sc.nextLine();
        String[] tokens = line.split(" ");
        int[] array = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            array[i] = Integer.parseInt(tokens[i]);
        }
        return array;
    }

    // Method to handle single line input with multiple strings (space-separated)
    public static String[] readStringArray(Scanner sc) {
        String line = sc.nextLine();
        return line.split(" ");
    }

    // Method to handle graph input (adjacency list)
    public static List<List<Integer>> readGraph(Scanner sc, int vertices, int edges) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u); // For undirected graph
        }
        return graph;
    }

    // Method to handle tree input (parent-child relationships)
    public static int[] readTree(Scanner sc, int n) {
        int[] parent = new int[n];
        for (int i = 1; i < n; i++) {
            parent[i] = sc.nextInt();
        }
        return parent;
    }

    // Method to handle multiple test cases
    public static List<int[]> readMultipleTestCases(Scanner sc, int t) {
        List<int[]> testCases = new ArrayList<>();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            testCases.add(array);
        }
        return testCases;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example usage
        System.out.println("Enter a single integer:");
        int singleInt = readSingleInteger(sc);
        System.out.println("Single Integer: " + singleInt);

        System.out.println("Enter a line of integers (space-separated):");
        int[] intArray = readIntegerArray(sc);
        System.out.println("Integer Array: " + Arrays.toString(intArray));

        System.out.println("Enter a line of strings (space-separated):");
        String[] strArray = readStringArray(sc);
        System.out.println("String Array: " + Arrays.toString(strArray));

        System.out.println("Enter number of vertices and edges for graph:");
        int vertices = sc.nextInt();
        int edges = sc.nextInt();
        List<List<Integer>> graph = readGraph(sc, vertices, edges);
        System.out.println("Graph: " + graph);

        System.out.println("Enter number of nodes for tree:");
        int nodes = sc.nextInt();
        int[] tree = readTree(sc, nodes);
        System.out.println("Tree: " + Arrays.toString(tree));

        System.out.println("Enter number of test cases:");
        int t = sc.nextInt();
        List<int[]> testCases = readMultipleTestCases(sc, t);
        System.out.println("Test Cases: " + testCases);

        sc.close();
    }
}
