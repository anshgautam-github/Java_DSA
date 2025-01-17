//BRUTEFORCE ->> O(n^2)

public class SubarraySumWithPrefixSum {


    public static int[] calculatePrefixSum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = arr[0]; 
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        return prefixSum;
    }

    public static int calculateTotalSubarraySum(int[] arr) {
        int n = arr.length;
        int[] prefixSum = calculatePrefixSum(arr);
        int totalSum = 0;

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                if (start == 0) {
                    totalSum += prefixSum[end];
                } else {
                    totalSum += prefixSum[end] - prefixSum[start - 1];
                }
            }
        }
        return totalSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int result = calculateTotalSubarraySum(arr);
        System.out.println("Total sum of all subarray sums: " + result);
    }
}


//OPTIMIZED ->> O(n)
