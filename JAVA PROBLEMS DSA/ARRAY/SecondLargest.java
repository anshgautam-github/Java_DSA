public class SecondLargest {

    static void find(int [] arr){

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){ //for finding largest
            if(arr[i]>largest){
                secondLargest=largest; //setting value of secondlargest to the previous value of largest
                largest=arr[i];
            }
            else if(arr[i]>secondLargest && arr[i]!=largest){ 
                secondLargest=arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second " + "largest element");
        } else {
            System.out.println("The second largest " + secondLargest);
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,20,15};
        find(arr);
        
    }
}


//The error in the last print statement is because the find method is declared with a void return type,
 //meaning it doesn't return anything. However, in the main method, you're trying to print the result
 // of calling find(arr) which won't work because find method doesn't return anything to print.