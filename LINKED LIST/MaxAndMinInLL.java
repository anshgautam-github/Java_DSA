
class MaxAndMinInLL
{
    static int maximum(Node head)
    {
        // your code here
        int max=head.data;
        for(Node curr=head.next; curr!=null; curr=curr.next){
            if(curr.data > max){
                max=curr.data;
            }
        }
        return max;
    }

    static int minimum(Node head)
    {
        // your code here
        
        int min=head.data;
        for(Node curr=head.next; curr!=null; curr=curr.next){
            if(curr.data < min){
                min=curr.data;
            }
        }
        return min;
    }
}
