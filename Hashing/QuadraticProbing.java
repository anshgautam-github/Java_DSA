//{ Driver Code Starts
import java.util.*;
import java.io.*;
import java.lang.*;

class gfg
{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- >0)
        {
            int hash_size = sc.nextInt();
            int N= sc.nextInt();
            
            int arr[] = new int[N];
            
            for(int i = 0; i < N ; i++)
             arr[i] = sc.nextInt();
             
            int hash_table[] = new int[hash_size];
            Solution obj = new Solution();
            obj.quadraticProbing(hash_table, hash_size, arr, N);
            
            for(int i = 0; i <hash_size; i++)
             System.out.print(hash_table[i] + " ");
             
             System.out.println();
             
        }
    }
    
}

// } Driver Code Ends



class Solution{
    
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {

        Arrays.fill(hash, -1);

        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        for (int num : set) {

            int probe = num % hash_size;

            if (hash[probe] == -1) {
                hash[probe] = num;
            } else {
                int multiplier = 1;
                while (hash[probe] != -1) {
                    probe = (int) ((num + Math.pow(multiplier, 2)) % hash_size);
                    multiplier++;
                }
                hash[probe] = num;
            }

        }

    }

}
