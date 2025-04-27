import java.util.*;

public class TopologicalSortDFS {
    public static void topologicalSortDFS(int node, boolean[] visited, Stack<Integer> stack, List<List<Integer>> adj) {
        visited[node] = true;

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                topologicalSortDFS(neighbor, visited, stack, adj);
            }
        }

        // Add the node to the stack after visiting all its neighbors
        stack.push(node);
    }

    public static List<Integer> topologicalSort(int n, List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        Stack<Integer> stack = new Stack<>();

        // Perform DFS for all unvisited nodes
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                topologicalSortDFS(i, visited, stack, adj);
            }
        }

        // Extract nodes from the stack to get the topological order
        List<Integer> topoOrder = new ArrayList<>();
        while (!stack.isEmpty()) {
            topoOrder.add(stack.pop());
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

        List<Integer> topoOrder = topologicalSort(n, adj);
        System.out.println("Topological Order (DFS): " + topoOrder);
    }
}