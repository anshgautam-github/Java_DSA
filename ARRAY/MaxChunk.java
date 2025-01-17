public class MaxChunk{

    public static int maxChunksToSorted(int[] arr) {
       int max=INTEGER.MIN_VALUE;
       int count=0;
       for(int i=0; i<arr.length;i++){
           max=Math.max(max,arr[i]);
           if(max==i){
               count++;
           }
       }
      return count;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 1, 0};
        int[] arr2 = {1, 0, 2, 3, 4};

        System.out.println(maxChunksToSorted(arr1)); 
        System.out.println(maxChunksToSorted(arr2)); 
    }
}
