// GCD stands for Greatest Common Divisor. It is the largest positive integer that divides
// both numbers without leaving a remainder. In other words, it is the largest integer that 
// divides both numbers evenly.


// To find the GCD of two numbers a and b, you can use the Euclidean algorithm.
// The Euclidean algorithm states that the GCD of two numbers a and b is equal to the GCD of 
// b and the remainder of a divided by b. 
// This process is repeated until the remainder becomes 0.

//gcd(a,b)=gcd(b,a%b)


class GCDEuclid
{
    // Complete the function
    // a: first number
    // b: second number
    public static int GCD(int a, int b)
    {
        // find and return GCD of two numbers;
        if(b==0){
            return a;
        }
        
        return  GCD(b,a%b);
        
    }
}
