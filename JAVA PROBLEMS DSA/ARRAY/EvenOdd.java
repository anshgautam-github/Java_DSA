//{ Driver Code Starts
//Initial Template for Java


import java.util.Scanner;

class EvenOdd {

    
// } Driver Code Ends
//User function Template for Java

public static int[] evenOdd(int[] numbers){
    // Create a new array to store even and odd elements
    int[] result = new int[numbers.length];
    int index = 0;

    // Fill the new array with even elements
    for (int num : numbers) {
        if (num % 2 == 0) {
            result[index++] = num;
        }
    }

    // Fill the new array with odd elements
    for (int num : numbers) {
        if (num % 2 != 0) {
            result[index++] = num;
        }
    }

    return result;
}

//{ Driver Code Starts.

    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while(t-- > 0) {
            int n = scn.nextInt();
            int[] numbers = new int[n];
            for(int i = 0; i < n; i++){
                numbers[i] = scn.nextInt();
            }
            int[] res = evenOdd(numbers);

            for(int i = 0; i < res.length;i++){
                System.out.print(res[i] + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}
// } Driver Code Ends