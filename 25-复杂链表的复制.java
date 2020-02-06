/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/
public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        if(pHead == null) return null;
        RandomListNode cur = pHead;
        while(cur != null){ //复制每个节点的值到它后面
            RandomListNode clone = new RandomListNode(cur.label);
            clone.next = cur.next;
            cur.next = clone;
            cur = cur.next.next;
        }
        cur = pHead;
        while(cur != null){ //修改复制的节点的random指针
            if(cur.random != null)
                cur.next.random = cur.random.next;
            cur = cur.next.next;
        }
        RandomListNode cloneHead = pHead.next;
        cur = pHead;
        while(cur != null){ //分离原链表与复制的链表
            RandomListNode next = cur.next;
            if(next != null){
                cur.next = next.next;
            }
            cur = next;
        }
        return cloneHead;
    }
}

