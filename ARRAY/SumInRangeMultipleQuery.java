//BRUTEFORCE APPROACH

public class SumInRangeMultipleQuery {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int[][] queries = {{0, 2}, {1, 4}, {2, 3}}; 

        calculateAndPrintSums(arr, queries);
    }

    public static void calculateAndPrintSums(int[] arr, int[][] queries) {
        
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];
            int sum = 0;
          
            for (int j = L; j <= R; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
        }
    }
}


//OPTIMIZED APPROACH

public class SumInRangeOptimal {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int[][] queries = {{0, 2}, {1, 4}, {2, 3}}; 

        calculateAndPrintSums(arr, queries);
    }

    public static void calculateAndPrintSums(int[] arr, int[][] queries) {
      
        int[] prefixSum = calculatePrefixSum(arr);
      
        for (int i = 0; i < queries.length; i++) {
            int L = queries[i][0];
            int R = queries[i][1];

            int sum;
            if (L == 0) {
                sum = prefixSum[R];
            } else {
                sum = prefixSum[R] - prefixSum[L - 1];
            }
            System.out.println(sum);
        }

        
    }
    public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }

        return prefixSum; 
    }
}
