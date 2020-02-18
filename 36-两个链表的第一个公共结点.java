//利用长度差
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         int len1 = getLength(pHead1);
        int len2 = getLength(pHead2);
        if(len1 < len2) return FindFirstCommonNode(pHead2,pHead1);
        int diff = len1 - len2;
        while(diff-- > 0) pHead1 = pHead1.next;         //使得链表长度相同再开始遍历
        while(pHead1 != pHead2){
            pHead1 = pHead1.next;
            pHead2 = pHead2.next;
        }
        return pHead1;
    }
    public int getLength(ListNode p){
        int cnt = 0;
        while(p != null){
            p = p.next;
            cnt++;
        }
        return cnt;
    }
}



//小技巧
/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
         ListNode p1 = pHead1, p2 = pHead2;
        while(p1 != p2){
            p1 = p1 != null ? p1.next : pHead2;
            p2 = p2 != null ? p2.next : pHead1;
        }
        return p1;
    }
}