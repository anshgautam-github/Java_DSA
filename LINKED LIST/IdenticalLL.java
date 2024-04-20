class IdenticalLL {
    
    //Function to check whether two linked lists are identical or not.
    public boolean isIdentical (Node head1, Node head2){
        //write your code here 
        while(head1!=null && head2!=null){
            if(head1.data != head2.data) return false;
                    head1=head1.next;
                    head2=head2.next;
        }

        // If both lists reach the end simultaneously, they are identical
        return (head1 == null && head2 == null);
    }
}
