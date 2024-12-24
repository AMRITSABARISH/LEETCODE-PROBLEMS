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
    public ListNode reverse(ListNode tail){
        ListNode sh=tail;
        ListNode prev=null;
        ListNode next=null;
        while(sh!=null){
            next=sh.next;
            sh.next=prev;
            prev=sh;
            sh=next;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode first=head;
        ListNode tail=reverse(slow);
        while(first!=null&&tail!=null){
            if(first.val!=tail.val){
                return false;
            }
            first=first.next;
            tail=tail.next;
        }
        return true;
    }
}