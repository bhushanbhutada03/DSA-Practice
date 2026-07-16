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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        int[]  map=new int[201];

        ListNode temp=head;
        while(temp!=null){
            map[temp.val+100]++;
            temp=temp.next;
        }

        
        ListNode dummy=new ListNode(101);
        ListNode ans=dummy;

        while(head!=null){
            if(map[head.val+100]==1){
                dummy.next=head;
                dummy=dummy.next;
            }
            head=head.next;
            
        }
        dummy.next=null;
        return ans.next;
    }
}