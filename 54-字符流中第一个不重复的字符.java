import java.util.*;
public class Solution {
    //Insert one char from stringstream
    private Queue<Character> queue = new LinkedList<>();
    int[] cnt = new int[256];
    public void Insert(char ch)
    {
        queue.add(ch);
        cnt[ch]++;
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        while(!queue.isEmpty() && cnt[queue.peek()] != 1){
            queue.poll();
        }
        return queue.isEmpty() ? '#': queue.peek();
    }
}