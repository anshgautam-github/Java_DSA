
class JoinTwoLL
{
    public static Node joinTheLists(Node head1, Node head2)
    {
           // your code here
           if(head1==null) return head2;
           if(head2==null) return head1;
           
           Node curr=head1;
           while(curr.next!=null){
               curr=curr.next;
           }
           curr.next=head2;
           return head1;
            
        
    }
}
