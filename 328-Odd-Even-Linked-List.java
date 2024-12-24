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
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode();
        ListNode even=new ListNode();
        ListNode l1=odd,l2=even;
        int i=1;
        while(head!=null){
            if(i%2==0){
                l2.next=new ListNode(head.val);
                l2=l2.next;
            }else{
                l1.next=new ListNode(head.val);
                l1=l1.next;
            }
            i++;
            head=head.next;

        }
        l1.next=even.next;
        return odd.next;
    }
}