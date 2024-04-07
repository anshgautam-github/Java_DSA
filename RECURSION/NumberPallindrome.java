//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            
            System.out.println(new Solution().isPalin(n)?1:0);
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    // Complete the function
    // N: input element
    static boolean isPalin(int N)
    {
        // Check if the number is palindrome or not
        //You may use a helper function if you like
        String val=String.valueOf(N);
         return isPalindromeRecursive(val, 0, val.length()-1);
    }
    
        static boolean isPalindromeRecursive(String str, int start, int end) {
        
            if(start>=end) return true;
            
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            
            return isPalindromeRecursive(str, start+1, end-1);
            
        }
}
