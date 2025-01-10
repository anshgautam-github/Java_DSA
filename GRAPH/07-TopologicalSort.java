import java.util.*;

public class TopologicalSort {

    public static void topologicalSort(int N, List<List<Integer>> graph) {
        // Step 1: Initialize the in-degree array
        int[] inDegree = new int[N];
        
        // Calculate in-degrees for all nodes
        for (int u = 0; u < N; u++) {
            List<Integer> neighbors = graph.get(u);
            for (int v : neighbors) {
                inDegree[v]++;
            }
        }

        // Step 2: Add nodes with in-degree 0 to the queue
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            if (inDegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: Perform BFS and construct the topological order
        while (!queue.isEmpty()) {
            int current = queue.remove();
            // Instead of adding to the topological order list, print the node
            System.out.println(current);

            // Reduce in-degree for all neighbors of the current node
            List<Integer> neighbors = graph.get(current);
            for (int neighbor : neighbors) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) {
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        int N = 6;
        int m = 6; 

        int[][] edges = {
            {5, 2}, 
            {5, 0}, 
            {4, 0}, 
            {4, 1}, 
            {2, 3}, 
            {3, 1}
        };

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            graph.get(u).add(v);
        }

        // Step 3: Perform topological sort
        try {
            System.out.println("Topological Order:");
            topologicalSort(N, graph);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
