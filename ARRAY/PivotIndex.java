//BruteForce Approach O(N^2)

public class PivotIndexBruteForce {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6}; 
        System.out.println(countPivotIndices(arr));
    }

    public static int countPivotIndices(int[] arr) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate sum of elements to the left of i
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            // Calculate sum of elements to the right of i
            for (int k = i + 1; k < n; k++) {
                rightSum += arr[k];
            }
            if (leftSum == rightSum) {
                count++;
            }
        }

        return count; 
    }
}


//OPTIMIZED APPROACH

public class PivotIndexWithPrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 6, 5, 6}; 
        System.out.println(countPivotIndices(arr));
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

    public static int countPivotIndices(int[] arr) {
        int n = arr.length;
        int count = 0;
        int[] prefixSum = calculatePrefixSum(arr);

         for (int i = 0; i < n; i++) {  
            int leftSum = (i == 0) ? 0 : prefixSum[i - 1];
            int rightSum =prefixSum[n-1]-prefixSum[i];
            if (leftSum == rightSum) {
                count++;
            }
        }

        return count; 
    }
}
