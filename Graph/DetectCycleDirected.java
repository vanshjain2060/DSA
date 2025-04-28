
public class DetectCycleDirected extends Input{
    public static void main(String[] args) {
        int[][] edges = {{1, 2}, {2}, {0,3}, {}};


        System.out.println(isCyclic(5, edges));
    }

    public static boolean isCyclic(int n, int[][] edges) {
        boolean[] visited = new boolean[n];
        boolean[] currPath = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i] && dfs(i, edges, visited, currPath))
                return true;
        }
        return false;
    }

    public static boolean dfs(int node, int[][] edges, boolean[] visited, boolean[] currPath) {
        visited[node] = true;
        currPath[node] = true;

        for (int i : edges[node]) {
            if (!visited[i] && dfs(i, edges, visited, currPath))
                return true;
            else if (currPath[i])
                return true;
        }
        currPath[node] = false;
        return false;
    }
}
