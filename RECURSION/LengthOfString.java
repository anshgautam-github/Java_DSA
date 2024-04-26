public class LengthOfString {
    
    // Recursive function to find the length of a string
    public static int findLength(String str) {
        // Base case: if the string is empty, return 0
        if (str.equals("")) {
            return 0;
        }
        // Recursive case: increment the length by 1 and call the function with the substring from index 1
        return 1 + findLength(str.substring(1));
    }
    
    public static void main(String[] args) {
        String testString = "Hello, World!";
        int length = findLength(testString);
        System.out.println("Length of the string \"" + testString + "\" is: " + length);
    }
}
