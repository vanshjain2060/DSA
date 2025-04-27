import java.util.*;
import java.util.LinkedList;

public class TopologicalSortBFS {
    public static List<Integer> topologicalSortBFS(int n, List<List<Integer>> adj) {
        int[] inDegree = new int[n];
        List<Integer> topoOrder = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        // Step 1: Calculate in-degree of each node
        for (int i = 0; i < n; i++) {
            for (int neighbor : adj.get(i)) {
                inDegree[neighbor]++;
            }
        }

        // Step 2: Add all nodes with in-degree 0 to the queue
        for (int i = 0; i < n; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        // Step 3: Process nodes in topological order
        while (!queue.isEmpty()) {
            int node = queue.poll();
            topoOrder.add(node);

            for (int neighbor : adj.get(node)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If topoOrder doesn't contain all nodes, the graph is not a DAG
        if (topoOrder.size() != n) {
            throw new IllegalArgumentException("The graph is not a DAG (contains a cycle).");
        }

        return topoOrder;
    }

    public static void main(String[] args) {
        int n = 6;
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        // Example graph
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        List<Integer> topoOrder = topologicalSortBFS(n, adj);
        System.out.println("Topological Order (BFS): " + topoOrder);
    }
}