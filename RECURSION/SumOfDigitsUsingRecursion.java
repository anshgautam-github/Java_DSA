// NOTE --   n%10 ->> Gives the last digit of n
//           n/10 ->> Removes the last digit on n


//LOGIC -> Try breaking the problem into the smaller parts
//EG->  256-> 6+ fun(25) ->> 5+ fun(2)..........so on
// then acc to it make recursion tree for finding base cond and write the code 

public class SumOfDigitsUsingRecursion {
    
    static int sum(int n){
		if(n < 10)
			return n;

        return sum(n/10) + n%10;
    }


    public static void main(String[] args) {
        int n=234;
        System.out.println(sum(n));
    }

}
