//Find the min no of perfect sq required to sum=N

import java.util.*;

class Main{

  public static int perfect(int n){
    int []dp=new int[n+1];
    Arrays.fill(dp,-1);
    return perfectHelper(n,dp);
  }

  public static int perfectHelper(int n,int[]dp){

    if(n==1|| n==0){return n;}

    if(dp[n]!=-1){return dp[n];}
    
    int mini=Integer.MAX_VALUE;
    for(int i=1; i*i<n;i++){
      int temp=perfectHelper(n-i*i,dp);
      mini=Math.min(mini,temp);
    }
    dp[n]=mini+1;
    return mini+1;
    
  }
  
  public static void main(String[]args){
    int n=6;
    System.out.println(perfect(n));
    
      }
}
