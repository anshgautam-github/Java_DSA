{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class Main {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		   
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0;i<n;i++){
		        arr[i] = sc.nextInt();
		    }
		    
		    Solution obj = new Solution();
		    System.out.println(obj.countOnes(arr, n));
		    
		}
		
	}
}
// } Driver Code Ends


//User function Template for Java
class Solution {
    static int countOnes(int arr[], int N) {
        int low = 0;
        int high = N - 1;
        int lastIndex = -1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (arr[mid] == 1) {
                lastIndex = mid;
                low = mid + 1; // Search in the right half to find the last occurrence
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        
        // If no 1s found, return 0
        if (lastIndex == -1)
            return 0;
        
        // Count of 1s is (lastIndex + 1)
        return lastIndex + 1;
    }
}
