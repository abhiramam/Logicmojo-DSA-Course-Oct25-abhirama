package assignments;

public class MergePoint {
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr1 = head1;
        SinglyLinkedListNode curr2 = head2;
        while(curr1 != curr2){
            if(curr1 == null){
                curr1 = head2;
            }else{
                curr1 = curr1.next;
            }
            if(curr2 == null){
                curr2 = head1;
            }else{
                curr2 = curr2.next;
            }


        }
        return curr1.data;



    }
}
