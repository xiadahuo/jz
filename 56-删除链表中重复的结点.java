/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null)
            return pHead;
        ListNode next = pHead.next;
        if(pHead.val == next.val){
            while(next != null && pHead.val == next.val){
                next = next.next;
            }
            return deleteDuplication(next);
        }else{
            pHead.next = deleteDuplication(next);
            return pHead;
        }
    }
}


/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        ListNode dummy = new ListNode(-1);
        dummy.next = pHead;
        ListNode p = dummy;
        while(p.next!= null){
            ListNode q = p.next;
            while(q.next != null && q.val == q.next.val){
                q = q.next;
            }
            if(p.next == q) p = p.next;
            else p.next = q.next;
        }
        return dummy.next;
    }
}













