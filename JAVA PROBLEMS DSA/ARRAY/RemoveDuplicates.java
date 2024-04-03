import java.util.*;
import java.io.*;
import java.lang.*;
class RemoveDuplicates 
{ 
    static int remDups(int arr[], int n)
    {
    	int res = 1;   //take index positin 1, compare it with previos one 

        //using loop -> check previous index value arr[(res-1) ] with the current arr value (arr[i])

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res - 1] != arr[i])  //not equal condition 
    		{
    			arr[res] = arr[i];
    			res++;
    		}
    	}

        //[2,3,3,5]
        //in case of repreated, the value of res will not increase and then once a non repeated will
        // come then it will get inserted at the correct position due to not incremernting the value if res
        // as it will point to the (old vvalue right after one time occured value) right index value 

    	return res;
    }

    public static void main(String args[]) 
    { 
       int arr[] = {10, 20, 20, 30, 30, 30}, n = 6;

       System.out.println("Before Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       n = remDups(arr, n);

       System.out.println("After Removal");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}