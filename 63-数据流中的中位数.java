import java.util.*;
public class Solution {
    private PriorityQueue<Integer> left = new PriorityQueue<>((o1,o2)->(o2-o1));  //左边大顶堆
    private PriorityQueue<Integer> right = new PriorityQueue<>((o1,o2)->(o1-o2));  //右边小顶堆
    private int cnt = 0;
    public void Insert(Integer num) {   //左边比右边多一个或个数相等
        if(cnt % 2 == 0){
            right.add(num);
            left.add(right.poll());
        }else{
            left.add(num);
            right.add(left.poll());
        }
        cnt++;
    }

    public Double GetMedian() {
        if(cnt % 2 == 0){
            return (left.peek() + right.peek()) / 2.0;
        }else{
            return (double) left.peek();
        }
    }
}