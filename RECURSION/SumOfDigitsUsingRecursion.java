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


// return sumOfDigits(n/10) + n%10;: In this expression, sumOfDigits(n/10) recursively calculates the sum of digits in the number n/10 (i.e., removing the last digit), and then n%10 calculates the last digit of the number n. Finally, these two results are added together. This approach correctly sums the digits from right to left, similar to how you would read a number.

// return n%10 + sumOfDigits(n/10);: In this expression, n%10 calculates the last digit of the number n, and then sumOfDigits(n/10) recursively calculates the sum of digits in the number n/10. Finally, these two results are added together. However, this approach calculates the sum of digits from left to right, which is not correct for this problem.

// The second approach doesn't give the correct result because it doesn't sum the digits in the correct order. It calculates the sum from left to right, which means it starts adding digits from the most significant digit to the least significant digit, which doesn't correspond to the actual numeric value of the digits in the number.

// Therefore, to correctly calculate the sum of digits in a number using recursion, you should use the first approach return sumOfDigits(n/10) + n%10;, where you first recursively calculate the sum of digits in the remaining number (n/10) and then add the last digit (n%10). This way, the digits are summed from right to left, which corresponds to the correct numeric value of the digits in the number.

//in maths also we are do from right to left 
