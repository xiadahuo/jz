/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//merge sort思想
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            }else{
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        if(list1 == null){
            cur.next = list2;
        }
        if(list2 == null){
            cur.next = list1;
        }
        return dummy.next;
    }
}

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
//递归
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null) return list2;
        else if(list2 == null) return list1;
        ListNode head = null;
        if(list1.val < list2.val){
            head = list1;
            head.next = Merge(list1.next, list2);
        }else{
            head = list2;
            head.next = Merge(list1, list2.next);
        }
        return head;
    }
}