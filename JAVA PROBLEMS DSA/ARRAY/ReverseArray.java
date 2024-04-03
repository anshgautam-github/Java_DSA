import java.util.Arrays;

public class ReverseArray {
    
    static void reverse(int[] arr){
        
        //take 2 var -> low & high -> low (start) , high ( ennd )
        //then just swap using low , high, low++, high --

        int low=0;
        int high=(arr.length)-1;

        while (low<high) {
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }

        //                   METHOD-1 for printing array

        // for(int i=0; i<arr.length; i++){
        //     System.out.print(arr[i]);
        // }
        //                   METHOD-2 for printing array
        System.out.print(Arrays.toString(arr)); 


                    //WRONG METHID =>    System.out.println(arr);   
        
    }
    
    
    public static void main(String[] args) {
        
        int arr[]={5,8,20,15};
        reverse(arr);
    }
}



//Arrays.toString() method from the java.util.Arrays class. This method converts the array to a
// string representation, where each element is separated by commas and enclosed within square
//brackets.


//When you print an array directly using System.out.print(arr), you're actually printing the reference 
//to the array object in memory. This is because Java's default behavior for printing objects is to call
//  their toString() method. For arrays, this method is not overridden from the Object class, so it
// defaults to the toString() implementation in Object, which prints the class name along
// with its hashcode (memory address).