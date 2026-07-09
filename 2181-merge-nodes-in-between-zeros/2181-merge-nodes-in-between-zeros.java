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
    public ListNode mergeNodes(ListNode head) {
        head=head.next;
        ListNode dummy=new ListNode(0);
        ListNode ans=dummy;
        int sum=0;

        while(head!=null){
            if(head.val==0){
                ListNode temp=new ListNode(sum,null);
                ans.next=temp;
                ans = ans.next;
                sum=0;
            }else{
                sum+=head.val;
            }
            head=head.next;
        }
    return dummy.next;
    }
}