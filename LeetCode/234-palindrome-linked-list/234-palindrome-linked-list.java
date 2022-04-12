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
import java.util.*;
class Solution {
    public boolean isPalindrome(ListNode head) {
        
        List<Integer> a = new LinkedList<>();
        ListNode aHead = head;
        while(aHead != null){
            a.add(aHead.val);
            aHead = aHead.next;
        }
        
        ListNode bNode = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = bNode;            
            bNode = head;
            head = nextNode;
        }
        
        for(int i=0; i<a.size()/2; i++){
            if(a.get(i) != bNode.val) return false;
            else bNode = bNode.next;
        }
        
        return true;
    }
}