import java.util.Collections;
import java.util.PriorityQueue;

public class PrintMedianAfterEachIteration {
    
    private PriorityQueue<Integer> left;
    private PriorityQueue<Integer> right;

    PrintMedianAfterEachIteration() {
        left = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
        right = new PriorityQueue<>(); // Min-heap
    }

    // Method to add a number and balance the heaps
    public void addNum(int num) {
        if (left.size() == right.size()) {
            right.add(num);
            left.add(right.poll());
        } else {
            left.add(num);
            right.add(left.poll());
        }
    }

    // Method to find the median
    public double findMedian() {
        if (left.size() == right.size()) {
            return (left.peek() + right.peek()) / 2.0;
        } else {
            return left.peek()*1.0;
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        PrintMedianAfterEachIteration medianFinder = new PrintMedianAfterEachIteration();
        int[] nums = {7, 10, 4, 3, 20, 15}; 

        System.out.println("Medians after each insertion:");
        for (int num : nums) {
            medianFinder.addNum(num); 
            System.out.println("After inserting " + num + ": " + medianFinder.findMedian());
        }
    }
}
