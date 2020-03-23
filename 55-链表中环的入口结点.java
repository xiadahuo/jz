/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/

//a+(b+c)*n + b = 2(a+b) ---->     a+b = n(b+c) n圈 ， 相遇再走a就到入口点了。

public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        if(pHead == null || pHead.next == null) return null;
        ListNode once = pHead, twice = pHead;
        do{
            if(twice == null || twice.next == null) return null;
            twice = twice.next.next;
            once = once.next;
        }while(once != twice);
        once = pHead;
        while(once != twice){
            once = once.next;
            twice = twice.next;
        }
        return once;
    }
}



