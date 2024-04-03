//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;

class ImmediateSmallX
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            String str[] = read.readLine().trim().split(" ");
            int arr[] = new int[n];
            
            for(int i =0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            int x = Integer.parseInt(read.readLine());
            System.out.println(new Solution().immediateSmaller(arr, n, x));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    // Function to find the element in the array which is smaller than X
    // and closest to it.
    public static int immediateSmaller(int arr[], int n, int x) {
        int closest = -1; // Initialize closest element to -1

        for (int i = 0; i < n; i++) {
            // If the current element is smaller than X and closer to X than the previous closest element
            if (arr[i] < x && (closest == -1 || Math.abs(arr[i] - x) < Math.abs(closest - x))) {
                closest = arr[i]; // Update the closest element
            }
        }

        return closest;
    }
}
