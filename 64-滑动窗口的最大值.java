//优先队列
import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(num == null || num.length < size || size <= 0) return res;
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1,o2)->(o2-o1));
        for(int i = 0; i < size; i++){
            pq.add(num[i]);
        }
        res.add(pq.peek());
        for(int i = 0, j = size; j < num.length; i++,j++){
            pq.remove(num[i]);
            pq.add(num[j]);
            res.add(pq.peek());
        }
        return res;
    }
}

//链表
import java.util.*;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(num == null || size <= 0 || num.length < size) return res;
        LinkedList<Integer> max = new LinkedList<>();
        for(int i = 0; i < num.length; i++){
            while(!max.isEmpty() && num[i] > num[max.peekLast()]){
                max.pollLast();
            }
            max.addLast(i);
            while(max.peekFirst() == i-size){
                max.pollFirst();
            }
            if(i >= size-1) res.add(num[max.peekFirst()]);
        }
        return res;
    }
}