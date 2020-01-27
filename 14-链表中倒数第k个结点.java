/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//快慢指针
public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head == null || k <= 0) return null;
        ListNode fast = head, slow = head;
        while(fast != null && k > 0){
            fast = fast.next;
            k--;
        }
        if(k > 0) return null;
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}