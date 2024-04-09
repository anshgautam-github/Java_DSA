package Hashing;
import java.util.*;
import java.lang.*;
import java.io.*;

public class SubarraySumZero {

    static int ZeroSumSubarray(int []arr, int n){
        Set<Integer> h = new HashSet<Integer>();
        int pre_sum=0;
        h.add(pre_sum);

        for (int i = 0; i < n; i++) {
            pre_sum+=arr[i];
            if(h.contains(pre_sum)==true) return 1;
            
            if(pre_sum==0) return 1;  //used for the case [-3,2,1,4] -> here prefix sum ->0, earlier in the code we have just handled for prefix sum to e repreated not 0 
            h.add(pre_sum);

        }
        return 0;

    }
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5, 3, 9, -4, -6, 7, -1};
        int n = arr.length;
        
        System.out.println(ZeroSumSubarray(arr, n));
        
    }
}

//TIME COMPLEXITY ->> O(n)