//here we r suppose to find sort in both asc and desc order 


class SortedLL
{
    public static boolean isSorted(Node head)
    {
        // your code here
                
          // your code here
        if(head == null || head.next == null)
        {
            return true;
        }
        Node curr = head;
        boolean ascending = true;
        boolean descending  = true;
        while(curr.next != null)
        {
            if(curr.data > curr.next.data)
            {
                ascending = false;
            }
            if(curr.data < curr.next.data)
            {
                descending = false;
            }
            curr = curr.next;
        }
        return ascending || descending;
    }
}
