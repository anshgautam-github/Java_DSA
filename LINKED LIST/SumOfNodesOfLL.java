
class SumOfNodesOfLL
{
    public static int sumOfElements(Node head)
    {
        // your code here
        int sum=0;
        for(Node curr=head; curr!=null; curr=curr.next){
            sum=sum+curr.data;
        }
        return sum;
        
    }
}
