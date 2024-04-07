// You are given a number n. You need to recursively find the nth term of the series S that is given by:
// S(n) = n+ n*(S(n-1)) and S(0) = 1


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
            
            System.out.println(new Sequence().theSequence(n));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

// Complete the function given 
class Sequence
{
    // N: input element 
    public static int theSequence(int N)
    {
        // your code here
        if(N==0) return 1;
        
        return N + N*theSequence(N-1);
    }

}
