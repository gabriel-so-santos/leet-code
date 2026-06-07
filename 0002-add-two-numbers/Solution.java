/**
* Time:  O(max(m, n))
* space: O(max(m, n))
*/ 

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        int digit = 0;
        
        while (l1 != null || l2 != null || carry != 0) {
            int value1 = l1 != null ? l1.val : 0;
            int value2 = l2 != null ? l2.val : 0;

            digit = value1 + value2 + carry;
            carry = 0;

            if (digit >= 10) {
                digit -= 10;
                carry++;
            }

            ListNode newNode = new ListNode(digit);

            if (head == null) {
                head = newNode;
            } else if (head.next == null) {
                head.next = newNode;
                tail = head.next;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }   
        return head;
    }
}
