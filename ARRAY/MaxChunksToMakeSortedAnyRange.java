public class MaxChunksToMakeSortedAnyRange {

    public static int maxChunksToSorted(int[] arr) {
        int n = arr.length;

        // Step 1: Calculate prefixMax
         int[]prefixMax=new int[n];
         prefixMax[0]=arr[0];
         for(int i=0; i<arr.length;i++){
             prefixMax[i]=Math.max(prefixMax[i-1],arr[i);
         }

        // Step 2: Calculate suffixMin
        int[] suffixMin = new int[n];
        suffixMin[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(suffixMin[i + 1], arr[i]);
        }

        // Step 3: Count chunks
        int chunks = 0;
        for (int i = 0; i < n - 1; i++) {
            if (prefixMax[i] <= suffixMin[i + 1]) {
                chunks++;
            }
        }

        // The last chunk
        return chunks + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 4, 4};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {1, 0, 2, 3, 4};

        System.out.println("Max chunks for arr1: " + maxChunksToSorted(arr1)); 
        System.out.println("Max chunks for arr2: " + maxChunksToSorted(arr2)); 
        System.out.println("Max chunks for arr3: " + maxChunksToSorted(arr3)); 
    }
}
