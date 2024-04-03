public class SortedArray {

    static boolean isSorted(int arr[]){
       
        for(int i=0; i<arr.length-1; i++){   //IMP -> arr.length-1, otherwise -> eroor idex out of bound -> bcoz it must be on the last index and trying to access i+1 elemet which does not exist 
            if(arr[i]>arr[i+1]){
               return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[]={5,8,20,15};
        System.out.println(isSorted(arr));
    }
}
