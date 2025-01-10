
import java.util.*;

public class DFS {

    public static void dfs(List<List<Integer>> graph, boolean[] visited, int src) {
        List<Integer> neighbors = graph.get(src); 

        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                visited[neighbor] = true; 
                System.out.println("Visited: " + neighbor);

                // Recursively visit the neighbor
                dfs(graph, visited, neighbor);
            }
        }
    }

    public static List<List<Integer>> constructGraph(int N, int M, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
    }

    public static void main(String[] args) {
        int N = 5; 
        int M = 6; 

        int[][] edges = {
            {0, 1},
            {0, 2},
            {1, 2},
            {1, 3},
            {3, 4},
            {4, 0}
        };
        List<List<Integer>> graph = constructGraph(N, M, edges);

        boolean[] visited = new boolean[N];
        visited[0] = true;
        dfs(graph, visited, 0);
    }
}
