import java.util.*;

class KthBinaryNumberGeneration{

  public static String generate(int k){
      Queue<String>q=new LinkedList<>(); 
       q.add("1");
        String ans="";
      for(int i=1;i<=k; i++){
          ans=q.remove();
          q.add(ans+"0");
          q.add(ans+"1");
      }
      return ans;
  }

  
    public static void main(String []args){
      int k=2;
      System.out.println(generate(k));
    }
}
