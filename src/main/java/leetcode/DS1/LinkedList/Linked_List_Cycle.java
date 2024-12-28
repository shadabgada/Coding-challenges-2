package leetcode.DS1.LinkedList;

import java.util.HashSet;

/*
https://leetcode.com/problems/linked-list-cycle/
solution:
https://leetcode.com/problems/linked-list-cycle/solutions/44614/java-11ms-solution-with-hashset-and-1ms-solution-without-extra-space/
2nd approach(refer 1st comment to understand):
https://leetcode.com/problems/linked-list-cycle/solutions/44694/accepted-clean-java-solution/
 */
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}


public class Linked_List_Cycle {


    public static boolean hasCycle(ListNode head) {

        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null) {

            if (nodes.contains(head))
                return true;
            nodes.add(head);
            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        ListNode head = new ListNode(3);
        head.next = new ListNode(2);
        head.next.next = new ListNode(0);
        head.next.next.next = new ListNode(-4);
        head.next.next.next = head.next;

        System.out.println(hasCycle(head));

    }
}
