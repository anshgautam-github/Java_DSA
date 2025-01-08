import java.util.ArrayList;
import java.util.List;

public class AdjacencyListConstruction {
    public static List<List<Integer>> constructGraph(int N, int M, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0]; 
            int v = edges[i][1]; 
            
            // Add the edge in both directions (undirected graph)
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        return graph;
      
    }

    public static void main(String[] args) {
        
        int N = 5; 
        int M = 4; 
        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 4}
        };

        List<List<Integer>> graph = constructGraph(N, M, edges);

        for (int i = 0; i < graph.size(); i++) {
            System.out.println(graph.get(i));
        }
    }
}
