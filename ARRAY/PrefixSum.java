//Bruteforce Approach O(N^2)

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int[] prefixSum = new int[n];
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<=i; j++){
                sum+=arr[j];
            }
            prefixSum[i]=sum;
        }  

         for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
      
}
}

//OPTIMAL APPROACH O(n)

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5}; 
        int n = arr.length;

        int[] prefixSum = new int[n];
        
        // Optimal approach: O(n)
        prefixSum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        for (int sum : prefixSum) {
            System.out.print(sum + " ");
        }
    }
}
