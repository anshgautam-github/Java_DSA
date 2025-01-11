import java.util.*;

// Pair class to represent graph edges (vertex and weight)
class Pair {
    int vertex; // Destination vertex
    int weight; // Weight of the edge

    Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}

// Pair class to represent PriorityQueue elements (vertex and weight so far)
class PairPQ implements Comparable<PairPQ> {
    int vertex; // Current vertex
    int weightSoFar; // Weight so far

    PairPQ(int vertex, int weightSoFar) {
        this.vertex = vertex;
        this.weightSoFar = weightSoFar;
    }

    @Override
    public int compareTo(PairPQ other) {
        return this.weightSoFar - other.weightSoFar;
    }
}

public class DijkstraAlgorithm {

    public static int[] dijkstra(List<List<Pair>> graph, int src) {
        int n = graph.size(); // Number of vertices
        int[] ans = new int[n];
        Arrays.fill(ans, Integer.MAX_VALUE); 

        PriorityQueue<PairPQ> pq = new PriorityQueue<>(); // Min-heap priority queue
        pq.add(new PairPQ(src, 0));
      
        while (!pq.isEmpty()) {
          
            PairPQ rem = pq.remove();

            // Skip if already visited
            if (ans[rem.vertex] != Integer.MAX_VALUE) {
                continue;
            }

            // Mark the vertex as visited by assigning the current weight
            ans[rem.vertex] = rem.weightSoFar;

            // Get all neighbors of the current vertex
            List<Pair> neighbors = graph.get(rem.vertex);

            for (Pair neighbor : neighbors) {
                // Check if the neighbor is not already visited
                if (ans[neighbor.vertex] != Integer.MAX_VALUE) {
                    continue;
                }

                // Add the neighbor to the priority queue with the updated weight
                pq.add(new PairPQ(neighbor.vertex, rem.weightSoFar + neighbor.weight));
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        // Create the graph as an adjacency list
        int n = 6; // Number of vertices
        List<List<Pair>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Pair(1, 2));
        graph.get(0).add(new Pair(2, 4));
        graph.get(1).add(new Pair(2, 1));
        graph.get(1).add(new Pair(3, 7));
        graph.get(2).add(new Pair(4, 3));
        graph.get(3).add(new Pair(5, 1));
        graph.get(4).add(new Pair(3, 2));
        graph.get(4).add(new Pair(5, 5));

        int src = 0;

        // Call Dijkstra's algorithm
        int[] shortestDistances = dijkstra(graph, src);

        // Print the shortest distances from the source to all vertices
        System.out.println("Shortest distances from vertex " + src + ":");
        for (int i = 0; i < shortestDistances.length; i++) {
            System.out.println("Vertex " + i + " -> " + shortestDistances[i]);
        }
    }
}
