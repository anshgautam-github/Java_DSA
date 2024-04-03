import java.util.Arrays;

public class LeftRotateByDPlaces {


    static void left(int[] arr, int d){
        int n=arr.length;

        int[] temp = new int[d];    //Creating temp array of size how many we have to shift

        for(int i=0; i<d; i++){     //LOOP 1->> Copy the elements that have to be shifted in temp
            temp[i]=arr[i];         //simple, loop from i from 0 to d
        }

        for(int i=d; i<n; i++){     //LOOP 2->> start from d till end, and bring them in front position  
            arr[i-d]=arr[i];        //by replcing them
        }

        for(int i=0; i<d; i++){     //LOOP 3->> 0 to d, and bring those temp values in the arr in the end
            arr[n-d+i]=temp[i];     // TRICK ->( n - d + i)
        }

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int arr[]={5,8,20,9};
        int d=2;
        left(arr,d);
    }

}





// Reversal method



// static void leftRotate(int arr[], int d, int n)
// {
//     d = d % n;  //ensuring d not > n
//     reverse(arr, 0, d - 1);            //for reversing elemtes till d index

//     reverse(arr, d, n - 1);             // reverse from d till end

//     reverse(arr, 0, n - 1);          // then reverse the whole array , u will get the result 

// }

// static void reverse(int arr[], int low, int high)
// {
//     while(low < high)
//     {
//         int temp = arr[low];
//         arr[low] = arr[high];
//         arr[high] = temp;

//         low++;
//         high--;
//     }
// }

// public static void main(String args[]) 
// { 
//    int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 2;

//    System.out.println("Before Rotation");

//    for(int i = 0; i < n; i++)
//    {
//            System.out.print(arr[i]+" ");
//    }

//    System.out.println();

//    leftRotate(arr, d, n);

//    System.out.println("After Rotation");

//    for(int i = 0; i < n; i++)
//    {
//            System.out.print(arr[i]+" ");
//    }

// } 