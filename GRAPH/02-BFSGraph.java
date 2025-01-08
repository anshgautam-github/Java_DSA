import java.util.*;

public class BFSGraph {
    
    public static void BFS(int N, int M, int[][] edges) {
        // Step 1: Construct the graph using adjacency list
        List<List<Integer>> graph = constructGraph(N, M, edges);

        // Step 2: Initialize a queue and a visited array
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N];

        // Step 3: Start BFS from node 0 (or any other starting node)
        queue.add(0);  // Add the starting node to the queue
        visited[0] = true;  // Mark it as visited

        // Step 4: Perform BFS traversal
        while (!queue.isEmpty()) {
            int currentNode = queue.remove();  // Dequeue a node
            System.out.print(currentNode + " ");  // Print the current node

            // Get all neighbors of the current node
            List<Integer> neighbors = graph.get(currentNode);

            // Loop through each neighbor
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {  // If the neighbor is unvisited
                    queue.add(neighbor);  // Enqueue the neighbor
                    visited[neighbor] = true;  // Mark it as visited
                }
            }
        }
    }

    private static List<List<Integer>> constructGraph(int N, int M, int[][] edges) {
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
            {0, 1}, {0, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}
        };

        BFS(N, M, edges);
    }
}
