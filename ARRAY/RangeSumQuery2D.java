class RangeSumQuery2D {

    private int[][] pSum; 
    public NumMatrix(int[][] matrix) {
        int n = matrix.length; 
        int m = matrix[0].length; 

        pSum = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == 0) {
                    pSum[i][j] = matrix[i][j];
                } else {
                    pSum[i][j] = pSum[i][j - 1] + matrix[i][j];
                }
            }
        }

        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                pSum[i][j] += pSum[i - 1][j];
            }
        }
    }

    public int sumRegion(int x1, int y1, int x2, int y2) {
        int sum = pSum[x2][y2];

        if (x1 - 1 >= 0) {
            sum -= pSum[x1 - 1][y2];
        }
        if (y1 - 1 >= 0) {
            sum -= pSum[x2][y1 - 1];
        }
        if (x1 - 1 >= 0 && y1 - 1 >= 0) {
            sum += pSum[x1 - 1][y1 - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };

        NumMatrix obj = new NumMatrix(matrix);

        System.out.println("Submatrix sum from (2, 1) to (4, 3): " + obj.sumRegion(2, 1, 4, 3));
        System.out.println("Submatrix sum from (1, 1) to (2, 2): " + obj.sumRegion(1, 1, 2, 2));
        System.out.println("Submatrix sum from (1, 2) to (2, 4): " + obj.sumRegion(1, 2, 2, 4));
    }
}
