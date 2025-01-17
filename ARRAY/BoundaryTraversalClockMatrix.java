public class BoundaryTraversalClockMatrix {

    public static void printBoundary(int[][] mat) {
        int M = mat.length;     
        int N = mat[0].length;  

        int i = 0, j = 0;

        // Print the first row (left to right)
        for (int k = 0; k < N - 1; k++) {
            System.out.print(mat[i][j] + " ");
            j++;
        }

        // Print the last column (top to bottom)
        for (int k = 0; k < M - 1; k++) {
            System.out.print(mat[i][j] + " ");
            i++;
        }

        // Print the last row (right to left)
        for (int k = 0; k < N - 1; k++) {
            System.out.print(mat[i][j] + " ");
            j--;
        }

        // Print the first column (bottom to top)
        for (int k = 0; k < M - 1; k++) {
            System.out.print(mat[i][j] + " ");
            i--;
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25}
        };

        printBoundary(mat);  
    }
}
