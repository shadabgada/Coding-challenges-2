package leetcode.DS1.LinkedList;

public class Reverse_Linked_List {
    public ListNode2 reverseList(ListNode2 head) {
        ListNode2 prev = null;
        while(head!=null) {

            // normal traverse
            ListNode2 nextNode = head.next;

            head.next = prev;
            prev = head;
            head = nextNode;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
