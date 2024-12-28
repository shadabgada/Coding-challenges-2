package leetcode.DS1.LinkedList;

/*
https://leetcode.com/problems/remove-linked-list-elements/
solution in comment:
https://leetcode.com/problems/remove-linked-list-elements/solutions/57324/ac-java-solution/comments/58897

 */
public class Remove_Linked_List_Elements {

    public static ListNode2 removeElements(ListNode2 head, int val) {

        ListNode2 dummy = new ListNode2(0);
        dummy.next = head;

        ListNode2 cur = dummy;

        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {

        ListNode2 head = new ListNode2(1);
        head.next = new ListNode2(2);
        head.next.next = new ListNode2(6);
        head.next.next.next = new ListNode2(3);
        head.next.next.next.next = new ListNode2(4);
        head.next.next.next.next.next = new ListNode2(5);
        head.next.next.next.next.next.next = new ListNode2(6);
        System.out.println("print before: ");
        printList(head);
        ListNode2 res = removeElements(head, 6);

        System.out.println("print after:");
        printList(res);

    }

    private static void printList(ListNode2 head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }


}
