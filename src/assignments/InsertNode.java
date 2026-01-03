package assignments;

class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;

    public SinglyLinkedListNode(int nodeData) {
        this.data = nodeData;
        this.next = null;
    }
}

public class InsertNode {
    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
        // Write your code here
        SinglyLinkedListNode curr = llist;
        int i = 0;
        while(curr != null){
            if(i == position-1){
                SinglyLinkedListNode node = new SinglyLinkedListNode(data);
                node.next = curr.next;
                curr.next = node;
                return llist;
            }
            i++;
            curr = curr.next;
        }
        return llist;
    }
}
