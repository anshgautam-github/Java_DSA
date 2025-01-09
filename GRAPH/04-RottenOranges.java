import java.util.*;

public class RottenOranges {

    static class Pair {
        int row;
        int col;
        int time;

        Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
    }

    public static int rottenOranges(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        Queue<Pair> q = new LinkedList<>();
        int freshCount = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 2) {
                    q.add(new Pair(i, j, 0)); // Add initial rotten oranges with time = 0
                } else if (mat[i][j] == 1) {
                    freshCount++;
                }
            }
        }

        // If no fresh oranges, return 0 (no time needed)
        if (freshCount == 0) {
            return 0;
        }

        int maxTime = 0;
 
        while (!q.isEmpty()) {
            Pair current = q.remove();
            int crow = current.row;
            int ccol = current.col;
            int ctime = current.time;

            // Check up
            if (crow - 1 >= 0 && mat[crow - 1][ccol] == 1) {
                q.add(new Pair(crow - 1, ccol, ctime + 1));
                mat[crow - 1][ccol] = 2; // Mark as rotten
                freshCount--; // Reduce fresh count
                maxTime = ctime + 1; // Update max time
            }

            // Check down
            if (crow + 1 < rows && mat[crow + 1][ccol] == 1) {
                q.add(new Pair(crow + 1, ccol, ctime + 1));
                mat[crow + 1][ccol] = 2; // Mark as rotten
                freshCount--; // Reduce fresh count
                maxTime = ctime + 1; // Update max time
            }

            // Check left
            if (ccol - 1 >= 0 && mat[crow][ccol - 1] == 1) {
                q.add(new Pair(crow, ccol - 1, ctime + 1));
                mat[crow][ccol - 1] = 2; // Mark as rotten
                freshCount--; // Reduce fresh count
                maxTime = ctime + 1; // Update max time
            }

            // Check right
            if (ccol + 1 < cols && mat[crow][ccol + 1] == 1) {
                q.add(new Pair(crow, ccol + 1, ctime + 1));
                mat[crow][ccol + 1] = 2; // Mark as rotten
                freshCount--; // Reduce fresh count
                maxTime = ctime + 1; // Update max time
            }
        }

        // Step 3: Check if any fresh orange remains
        return freshCount == 0 ? maxTime : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the grid dimensions
        int m = sc.nextInt();
        int n = sc.nextInt();

        // Input the grid
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Compute and output the result
        int result = rottenOranges(mat);
        System.out.println(result);
    }
}
