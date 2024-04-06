                                                                curr=""
                                                                /    \
                                                               ""     "A"
                                                            /   \       / \
                                                          ""    "B"     "A" "AB"
                                                        / \     / \      / \     /  \
                                                      ""  "C"  "B" "BC" "A" "AC" "AB" "ABC"   
                                                                  
// LOGIC ->> Try to break a problem into smaller parts
// here, we can take an empty string , and keep then we have 2 cases -> remaain as it as || (or) add a new charac

public class GenerateSubsets {
    
  	
	static void printSub(String str, String curr, int index)
	{
		if(index == str.length())
		{
			System.out.print(curr+" ");
			return;
		}

		printSub(str, curr, index + 1);
		printSub(str, curr+str.charAt(index), index + 1);
	}
    public static void main(String [] args) 
    {
    	String str = "ABC";
    	
    	printSub(str, "", 0);
        
    }
}
