import java.util.ArrayList;
import java.util.List;

public class DFS extends Input {
    public static void main(String[] args) {
        int[][] graph = { { 1, 2 }, { 1, 3 }, { 3, 4 }, { 2, 5 }, { 2, 6 }, { 3, 7 }, { 4, 8 }, { 7, 8 } };
        ArrayList<ArrayList<Integer>> list = getGraph(graph);
        System.out.println(dfsTraversal(list));
    }

    public static List<Integer> dfsTraversal(ArrayList<ArrayList<Integer>> list) {
        List<Integer> ans = new ArrayList<>();
        boolean[] visited = new boolean[list.size()];

        for (int i = 0; i < list.size(); i++) {
            if (!visited[i] && !list.get(i).isEmpty()) {
                dfs(i, list, visited, ans);
            }
        }
        return ans;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> list, boolean[] visited, List<Integer> ans) {
        visited[node] = true;
        ans.add(node);
        
        for(int i : list.get(node)) {
            if(!visited[i]) {
                dfs(i, list, visited, ans);
            }
        }
    }
}