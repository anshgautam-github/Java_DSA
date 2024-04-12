public class HoarePartition {
    public static void main (String[] args) 
    {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};
        
        int n = arr.length;
        partition(arr,0,n-1);
        
	    for(int x: arr)
	        System.out.print(x+" ");
        
    }
    
    static int partition(int arr[], int l, int h)
    {   

        int pivot=arr[l];
        int i=l-1;
        int j=h+1;

        while (true) {
            do {
                i++;       //we stop i -> when we find big than  pivot -> so in ++, opp case will be there
            } while (arr[i]<pivot);
            do {
                j--;
            } while (arr[j]>pivot);

            if(i>=j) return j; ////check whether they cross or not 
            //swapping between arr[i] & arr[j]  
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;         
        }

    }
}
