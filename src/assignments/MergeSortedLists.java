package assignments;

public class MergeSortedLists {
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode curr1 = head1;
        SinglyLinkedListNode curr2 = head2;
        SinglyLinkedListNode res = new SinglyLinkedListNode(0);
        SinglyLinkedListNode curr3 = res;
        while(curr1 != null && curr2 != null){
            if (curr1.data < curr2.data) {
                curr3.next = curr1;
                curr1 = curr1.next;
            } else {
                curr3.next = curr2;
                curr2 = curr2.next;
            }
            curr3 = curr3.next;
        }
        if (curr1 != null) {
            curr3.next = curr1;
        }
        else {
            curr3.next = curr2;
        }
        return res.next;


    }
}
