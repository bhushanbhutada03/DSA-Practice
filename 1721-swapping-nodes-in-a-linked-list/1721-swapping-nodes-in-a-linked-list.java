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
    public ListNode swapNodes(ListNode head, int k) {
        int len=0;
        ListNode temp=head;
        while(temp!=null){
            len++;
            temp=temp.next;
        }

        if(k==(len+1)-k) return head;

        ListNode n1=null;
        temp=head;
        for(int i=0;i<k-1;i++){
            temp=temp.next;
        }
        n1=temp;

        ListNode n2=null;
        temp=head;
        for(int i=0;i<len-k;i++){
            temp=temp.next;
        }
        n2=temp;

        int val=n1.val;
        n1.val=n2.val;
        n2.val=val;

        return head;

    }
}