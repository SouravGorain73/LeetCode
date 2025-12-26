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
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        return getNode((size/2), head);
    }
    public ListNode getNode(int index, ListNode head){
        ListNode node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
}