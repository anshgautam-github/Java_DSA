
public class MoveZeroesToEnd {

    static void move(int [] arr){
        int count=0;  //for counting non zeroes
        int n=arr.length;

        // EG->  [2,3,0,0,6]
        
// Traverse the array. If element encountered is non-zero,
// then replace/swap the element at index 'count' with this element => swap(arr[i], arr[count])
//For zero, just neglect them and dont icrease the value of count for zeroes if encountered

        for (int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }


// Now all non-zero elements have been shifted to front and 'count' is set as index of first 0 in the array.
// => bcoz count denotes index of non zeroes so after non zero , zero must be inserted. 
// Make all elements 0 from count to end.

        while (count<n) {
            arr[count++]=0;   //incementing after arr[count]=0.
        }
    }


    public static void main(String[] args) {
        int arr[]={5,8,20,9};
        move(arr);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
    }

}
