package leetcode.DS1.LinkedList;

/*
https://leetcode.com/problems/merge-two-sorted-lists/
https://leetcode.com/problems/merge-two-sorted-lists/solutions/9858/java-solution-for-reference/
 */

class ListNode2 {
    int val;
    ListNode2 next;

    ListNode2() {
    }

    ListNode2(int val) {
        this.val = val;
    }

    ListNode2(int val, ListNode2 next) {
        this.val = val;
        this.next = next;
    }
}

public class Merge_Two_Sorted_Lists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        ListNode result = new ListNode(0);
        ListNode prev = result;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                prev.next = list1;
                list1 = list1.next;
            } else {
                prev.next = list2;
                list2 = list2.next;
            }
            prev = prev.next;
        }

        // either of them can still be no null (this happens when one of them gets null is above while condition)
        if (list1 != null) {
            prev.next = list1;
        }

        if (list2 != null) {
            prev.next = list2;
        }

        return result.next;

    }

    public static void main(String[] args) {


    }

}
