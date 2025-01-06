//given  n, how  many ways we can go from 0 to n stairs. If only 1 and 2 steps are allowed.
import java.util.*;

class ZerotoNWays{

  public static int count(int n){
    int []dp=new int[n+1];
    Arrays.fill(dp,-1);
    return countHelper(n,dp);
  }

  public static int countHelper(int n, int[]dp){

    if(n==1 || n==2){return n;}
    if(dp[n]!=-1){return dp[n];}
    int x=countHelper(n-1,dp);
    int y=countHelper(n-2,dp);
    dp[n]=x+y;
    return x+y;
    
  }
  
  public static void main(String[] args){
      int n=1;
     System.out.println(count(n));
  }
}
