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
    public ListNode mergeKLists(ListNode[] lists) {
     if(lists==null || lists.length==0){
        return null;
     }
     return mergeKKLists(lists,0,lists.length-1);
    }

    public ListNode mergeKKLists(ListNode[] list,int start,int end){
        if(start==end){
            return list[start];
        }
        if(start+1==end){
            return MergeTwoList(list[start],list[end]);
            }
            int mid=start+(end-start)/2;
            ListNode leftMerge=mergeKKLists(list,start,mid);
            ListNode rightMerge=mergeKKLists(list,mid+1,end);

            return  MergeTwoList(leftMerge,rightMerge);
        }
   
   private ListNode MergeTwoList(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                current.next=l1;
                l1=l1.next;
            }
            else{
                current.next=l2;
                l2=l2.next;
            }
             current=current.next;
        }
       
        current.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
    }
