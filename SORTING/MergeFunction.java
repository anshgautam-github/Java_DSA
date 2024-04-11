import java.util.*;
import java.lang.*;
import java.io.*;

//elemts in the array are sorted from low -> mid , and (mid+1) -> high are sorted
//now sort both are part in the array

class Solution
{
    public static void main (String[] args) 
    {
        int a[] = new int[]{10,15,20,40,8,11,15,22,25};
	    int l=0,h=8,m=3;
        
        merge(a,l,m,h);
	    for(int x: a)
	        System.out.print(x+" ");
        
    }
    
    static void merge(int arr[], int l, int m, int h){
    //we create left and right array and from the main array we  insert elemts into them 
        int n1=m-l+1, n2=h-m;
        int[] left=new int[n1];
        int[]right=new int[n2];
        
        //insertion into left
        for(int i=0;i<n1;i++)
            left[i]=arr[i+l];
            
        //insertion into right
        for(int j=0;j<n2;j++)
            right[j]=arr[m+1+j];//m-> from mid we ewant to cpy 
            
        int i=0,j=0,k=l;
        
        //sorting code
        while(i<n1 && j<n2){
            if(left[i]<=right[j])
                arr[k++]=left[i++];
            else
                arr[k++]=right[j++];
        }
        while(i<n1)
            arr[k++]=left[i++];
        while(j<n2)
            arr[k++]=right[j++];    
    }
}
