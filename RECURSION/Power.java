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
            String str[] = read.readLine().trim().split(" ");
            int n  =Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            
            Get obj = new Get();
            System.out.println(obj.nCr(n, r));
        }
    }
}


// } Driver Code Ends


//User function Template for Java


class Get
{
    public static int nCr(int n,int r)
    {
        // your code here
        
        if (r == 0 || r == n) return 1;
        
        return nCr(n-1, r-1)+ nCr(n-1,r);
        
    }
}


    // static int RecursivePower(int n,int p)
    // {
    //     // add your code here
    //     if(p==0) return 1;
        
    //     if(p%2==0){ //EVEN 
    //         return RecursivePower(n,p/2)* RecursivePower(n,p/2);
    //     }
    //     else{
    //         return  RecursivePower(n,p-1)*n;
    //     }
        
//more efficeint 

    // static int RecursivePower(int n,int p)
    // {
    //     // add your code here
    //     if(p==0) return 1;
        
    //     if(p%2==0){ //EVEN 
    //      long res=RecursivePower(n,p/2);       
    
    //          return res*res;
    //     }
    //     else{
    //         return  RecursivePower(n,p-1)*n;
    //     }
        
