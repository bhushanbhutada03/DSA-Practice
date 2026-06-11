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
    public int getDecimalValue(ListNode head) {
        ListNode temp =head;
        LinkedList<Integer> list= new LinkedList<>();

        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }   

        int count=0;
        int value=0;

        while(list.size()>0){
            if(list.getLast()==1){
                value=value +(int)Math.pow(2,count);
            }
            count++;
            list.removeLast();
        } 
        return value;    
    }
}