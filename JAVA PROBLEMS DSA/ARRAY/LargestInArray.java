public class LargestInArray {
    
    static int getLargest(int arr[]){

        //assume a 0 or smallest no to be largest and compare it with all the elements
        // if u find greater than it then just swap it

        int res=0;

        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>res){
                res=arr[i];
            }
        } 

        return res;
    }
    
    
    public static void main(String[] args) {
        
        int arr[]={5,8,20,15};
        System.out.println(getLargest(arr));
    }
}




/// No, you don't always have to write i < arr.length - 1 in all traversing code of an array. It depends on the specific logic you're
// implementing within your loop.

// The reason we write i < arr.length - 1 in the isSorted method is because we are comparing each element of the array with its
// immediate next element (arr[i] with arr[i+1]). In such cases, we want to stop the loop at the second-to-last element (arr.length - 2),
// because if we try to access arr[i+1] when i is equal to arr.length - 1, it will cause an ArrayIndexOutOfBoundsException.

// However, there are cases where you might need to iterate through all elements of the array, including the last one.