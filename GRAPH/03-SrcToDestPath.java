import java.util.*;

public class SrcToDestPath {
    public static boolean canVisit(int n, int m, int[][] edges, int source, int destination) {
         List<List<Integer>> graph=new ArrayList<>();
         for(int i=0; i<n;i++){
             graph.add(new ArrayList<>());
         }
         for(int i=0;i<m;i++){
             int u=edges[i][0];
             int v=edges[i][1];
             graph.get(u).add(v);
             graph.get(v).add(u);
         }

        boolean [] visited=new boolean[n];
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        visited[source]=true;

        while(!q.isEmpty()){
            int rem=q.poll();
            List<Integer> neigh=graph.get(rem);
            for(int n:neigh){
                if(visited[n]==false){
                  q.add(n);
                  visited[n]=true;
                }
            }
        }
      return visited[destination];
    }

    public static void main(String[] args) {
        int n = 6; 
        int m = 7;
        int[][] edges = {
            {0, 1}, {0, 2}, {1, 3}, {2, 4}, {3, 5}, {4, 5}, {1, 4}
        };
        int source = 0;
        int destination = 5;

        System.out.println(canVisit(n, m, edges, source, destination)
            ? "Destination is reachable from source."
            : "Destination is NOT reachable from source.");
    }
}
