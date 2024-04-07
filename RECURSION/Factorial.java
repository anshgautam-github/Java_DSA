//{ Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.io.*;
import java.lang.*;


class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            System.out.println(new Solution().factorial(n));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    // complete the function
    // N: input element
    static int factorial(int N)
    {
        // find and return the factorial of N
        if(N==0 || N==1){
            return 1;
        }
        
        return N* factorial(N-1);
    }
}
