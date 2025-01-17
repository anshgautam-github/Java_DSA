public class SquareMatrixSpiralPrint {

    public static void printSpiral(int[][] mat) {
        int i = 0, j = 0;
        int steps = mat[0].length - 1; 

        while (steps >= 1) {
            // Traverse the first row from left to right
            for (int k = 0; k < steps; k++) {
                System.out.print(mat[i][j] + " ");
                j++;
            }

            // Traverse the last column from top to bottom
            for (int k = 0; k < steps; k++) {
                System.out.print(mat[i][j] + " ");
                i++;
            }

            // Traverse the last row from right to left
            for (int k = 0; k < steps; k++) {
                System.out.print(mat[i][j] + " ");
                j--;
            }

            // Traverse the first column from bottom to top
            for (int k = 0; k < steps; k++) {
                System.out.print(mat[i][j] + " ");
                i--;
            }

            // Move to the next inner square
            i++;
            j++;
            steps -= 2; // Reduce the steps by 2 for the next square
        }

        // If steps == 0, print the center element (for odd-dimension matrices)
        if (steps == 0) {
            System.out.print(mat[i][j] + " ");
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printSpiral(mat); // Call the function to print in spiral order
    }
}
