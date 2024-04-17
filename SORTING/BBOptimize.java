/*package whatever //do not write package name here */

import java.io.*;

class GFG {
    
    static void bubbleSort(int arr[], int n){
        boolean swapped;
        
        for(int i = 0; i < n; i++){
            
            swapped = false;
            
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    
                    swapped = true;
                    
                }
            }
            if(swapped == false)
            break;
        }
    }
    
	public static void main (String[] args) {
	    int a[] = {2, 1, 4, 3};
	    bubbleSort(a, 4);
	    
	    for(int i = 0; i < 4; i++){
	        System.out.print(a[i] + " ");
	    }
	}
}

// In the version with the boolean variable, the algorithm terminates early if no swaps occur during a pass, indicating that the array is already sorted.

// In the version without the boolean variable, the algorithm always completes all passes specified by the outer loop, regardless of whether the array
// is already sorted or not. It doesn't have a mechanism to terminate early based on whether swaps occurred during a pass.


