public class SubArrayStoE {
  
    public static void printSubarray(int[] arr, int s, int e) {

        if (s < 0 || e >= arr.length || s > e) {
            System.out.println("Invalid indices.");
            return;
        }
        for (int i = s; i <= e; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 5, 6, 7};
        
        int s = 2; 
        int e = 5; 
        printSubarray(arr, s, e);
    }
}



