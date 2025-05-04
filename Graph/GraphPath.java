import java.util.*;
import java.util.LinkedList;

public class GraphPath {

    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        return dfs(graph, start, end, visited);
    }

    private boolean dfs(List<List<Integer>> graph, int curr, int end, boolean[] visited) {
        if (curr == end) return true; 

        visited[curr] = true;

        for (int neighbor : graph.get(curr)) {
            if (!visited[neighbor]) {
                if (dfs(graph, neighbor, end, visited)) {
                    return true;
                }
            }
        }

        return false;
    }



    public List<Integer> nodesAtKEdges(int n, int[][] edges, int start, int k) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        Queue<int[]> queue = new LinkedList<>();
        boolean[] visited = new boolean[n];
        queue.offer(new int[]{start, 0});
        visited[start] = true;

        List<Integer> result = new ArrayList<>();

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int node = curr[0];
            int d = curr[1];

            if (d == k) {
                result.add(node);
            }

            if (d > k) continue;

            for (int i : graph.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(new int[]{i, d + 1});
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        GraphPath gp = new GraphPath();

        int n = 6;
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        int start = 0, end = 5;
        System.out.println("Valid Path: " + gp.validPath(n, edges, start, end));

        int[][] edges2 = {{0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 5}};
        int startNode = 0, k = 2;
        System.out.println("Nodes at K Edges: " + gp.nodesAtKEdges(6, edges2, startNode, k));
    }
}