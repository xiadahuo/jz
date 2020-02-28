//递归
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0) return -1;
        if(n == 1) return 0;
        return (LastRemaining_Solution(n-1,m) + m) % n;
    }
}


//链表模拟
import java.util.*;
public class Solution {
    public int LastRemaining_Solution(int n, int m) {
        if(n <= 0) return -1;
        List<Integer> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        int index = 0;
        while(list.size() > 1){
            index = (index + m -1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }
}