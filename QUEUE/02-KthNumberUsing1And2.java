import java.util.*;

class MKthNumberUsing1And2{


  public static int generate(int k){
     Queue<String>q=new LinkedList<>(); 
     q.add("1");
     q.add("2");
      String res="";
     for(int i=0 ;i<k; i++){
         res=q.poll();
         q.add(res+"1");
         q.add(res+"2");
     }
     return Integer.parseInt(res);
  }

    public static void main(String []args){
      int k=4;
      System.out.println(generate(k));
    }

  
}
