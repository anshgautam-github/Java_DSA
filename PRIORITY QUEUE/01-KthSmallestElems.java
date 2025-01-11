import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElems {
    public static void findKSmallestElements(int[] arr, int k) {
        
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Add the first K elements to the max-heap
        for (int i = 0; i < k; i++) {
            maxHeap.add(arr[i]);
        }

        // Iterate over the remaining elements in the array
        for (int i = k; i < arr.length; i++) {
            // If the current element is smaller than the root of the heap
            if (arr[i] < maxHeap.peek()) {
                maxHeap.remove(); 
                maxHeap.add(arr[i]); 
            }
        }

        // Print all K smallest elements from the max-heap
        System.out.println("The " + k + " smallest elements are:");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.remove() + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;

        findKSmallestElements(arr, k);
    }
}
