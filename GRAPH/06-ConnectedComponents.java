import java.util.*;

public class ConnectedComponents {

    // Function to construct the graph
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

    // DFS function
    public static void dfs(List<List<Integer>> graph, boolean[] visited, int src) {
        List<Integer> neighbors = graph.get(src);

        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                dfs(graph, visited, neighbor);
            }
        }
    }

    // Main function
    public static void main(String[] args) {
        int N = 6; // Number of nodes
        int M = 5; // Number of edges
        int[][] edges = {
            {0, 1},
            {1, 2},
            {3, 4},
            {4, 5},
            {2, 3}
        };

        // Construct the graph
        List<List<Integer>> graph = constructGraph(N, M, edges);

        // Array to keep track of visited nodes
        boolean[] visited = new boolean[N];

        int connectedComponents = 0;

        // Loop through all nodes
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(graph, visited, i); 
                connectedComponents++;
            }
        }

        System.out.println(connectedComponents);
    }
}

