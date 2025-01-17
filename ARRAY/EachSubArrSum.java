//BRTUTEFORCE ->>> O(n^3)

public class SubarraySumPrinter {
    
    public static void printAllSubarraySums(int[] arr) {
        int n = arr.length;

        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum += arr[end];
                System.out.println("Subarray (" + start + ", " + end + ") sum: " + sum);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        printAllSubarraySums(arr);
    }
}


//OPTIMIZED ->> O(n^2)

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

   public static void printAllSubarraySums(int[] arr) {
        int n = arr.length;
        int[] prefixSum = calculatePrefixSum(arr);

        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                 if (start == 0) {
                    System.out.println("Subarray (" + start + ", " + end + ") sum: " + prefixSum[end]);
                } else {
                    int sum = prefixSum[end] - prefixSum[start - 1];
                    System.out.println("Subarray (" + start + ", " + end + ") sum: " + sum);
                }
            }
        }
    }


    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4};
        printAllSubarraySums(arr);
    }
}
