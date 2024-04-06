/**
 * PrintNto1
 */
public class PrintNto1 {


    static void rec(int n){
        if(n==0) return;

        // rec(n-1);
        //if i write the recursive line above the print statement, think what will happen ->recursion tree make
        //HINT ->> first we are decreasing till it reaches 1, then we will print from below func call
        System.out.println(n);
        rec(n-1);

    }
    public static void main(String[] args) {
        int n=4;
        rec(n);
    }
}

// TIME COMPLEXITY ->> O(n)
// total recursive call -> n+1  (verify with the recursion tree) ->>> O(n+1) = O(n) 


//AUXILARY SPCAE ->> O(n) 
//takes space in every fun call, and we have total n+1 func calls

// if your complier ->> modern complier ->> and does tail recursion 
//then AUXILARY SPACE ->> O(1)
