import java.util.*;
import java.io.*;
import java.lang.*;
class Main 
{ 
    
    static void TowerOfHanoi(int n, char A, char B, char C) 
    { 
        if (n == 1) 
        { 
            System.out.println("Move 1 from " +  A + " to " + C); 
            return; 
        } 
        TowerOfHanoi(n-1, A, C, B); 
        System.out.println("Move " + n + " from " +  A + " to " + C); 
        TowerOfHanoi(n-1, B, A, C); 
    } 
      
   
    public static void main(String args[]) 
    { 
        int n = 2; 
        TowerOfHanoi(n, 'A', 'B', 'C');  
    } 
}