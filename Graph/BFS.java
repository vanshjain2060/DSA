import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS extends Input{
    public static void main(String[] args) {
        int[][] graph = { { 1, 2 }, { 1, 6 }, { 2, 3 }, { 2, 4 }, { 6, 7 }, { 6, 9 }, { 4, 5 }, { 7, 8 }, { 5, 8 } };
        ArrayList<ArrayList<Integer>> list = getGraph(graph);
        System.out.println(bfsTraversal(list));
    }

    public static List<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> list) {
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[list.size()];

        visited[1] = true;
        q.offer(1);

        while(!q.isEmpty()) {
            int curr = q.poll();
            ans.add(curr);

            List<Integer> temp = list.get(curr);
            for(int i : temp) {
                if(!visited[i]) {
                    visited[i] = !visited[i];
                    q.offer(i);
                }
            }
        }

        return ans; 
    }
}
