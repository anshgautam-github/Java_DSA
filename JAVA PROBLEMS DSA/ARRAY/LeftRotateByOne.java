import java.util.Arrays;

public class LeftRotateByOne {


    static void left1(int [] arr){

        //store the first element in a temp 

        int temp=arr[0];
        int n=arr.length;

        //then replace the elements using a for loop one position behind 

        for(int i=1; i<arr.length; i++){
            arr[i-1]=arr[i];
        }

        // then at last position at the temp 

        arr[n-1]=temp;
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[]={5,8,20,9};
        left1(arr);
    }

}
