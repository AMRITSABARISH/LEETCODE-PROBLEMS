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
        ListNode out=new ListNode(0);
        ListNode curr=out;
        int c=0;
        while(l1!=null || l2!=null || c!=0){
            int s=c;
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
           
            curr.next =new ListNode(s%10);
            c=s/10;
            curr=curr.next;
        }
        return out.next; 
    }
}