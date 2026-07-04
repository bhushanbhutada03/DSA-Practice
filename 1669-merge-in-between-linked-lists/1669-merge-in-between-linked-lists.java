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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode last=null;
        ListNode temp=list2;

        while(temp!=null){
            if(temp.next==null) last=temp;
            temp=temp.next;
        }
        
        ListNode temp1=list1;
        for(int i=0;i<a-1;i++){
            temp1=temp1.next;
        }

        ListNode temp2=list1;
        for(int i=0;i<=b;i++){
            temp2=temp2.next;
        }


        temp1.next=list2;
        last.next=temp2;

        return list1;
    }
}