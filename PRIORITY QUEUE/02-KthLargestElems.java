import java.util.PriorityQueue;

public class KthLargestElems {
    public static void findKLargestElements(int[] arr, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

      
        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            // If the current element is larger than the root of the heap
            if (arr[i] > minHeap.peek()) {
                minHeap.remove(); 
                minHeap.add(arr[i]);
            }
        }

        while (!minHeap.isEmpty()) {
            System.out.print(minHeap.remove() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKLargestElements(arr, k);
    }
}
