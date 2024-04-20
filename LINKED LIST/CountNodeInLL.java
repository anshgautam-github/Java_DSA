class CountNodeInLL
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {
        int count=0;
        for(Node curr=head; curr!=null; curr=curr.next){
            count++;
        }
        return count;
        
        //Code here
    }
}
    
