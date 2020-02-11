import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input == null || input.length == 0 || k <= 0 || k > input.length)
            return res;
        findKthSmallest(input, k-1);  //找出index 0~(k-1) 这k个数
        for(int i = 0; i < k; i++){
            res.add(input[i]);
        }
        return res;
    }
    public void findKthSmallest(int[] input, int k){
        int l = 0, r = input.length-1;
        while(l < r){
            int j = partition(input, l, r);   //j分成的左右两部分
            if(j == k) break;
            else if(j > k) r = j-1;
            else l = j+1;
        }
    }
    //快排思想
    public int partition(int[] input, int l, int r){
        int i = l, j = r;
        int pivot = input[l];        //取左边第一个数为pivot
        while(i < j){
            while(i < j && input[j] >= pivot) j--;  //找到右边第一个比pivot小的数字
            while(i < j && input[i] <= pivot) i++;  //找左边第一个比pivot大的数字
            if(i < j){
                swap(input, i, j);
            }
        }
        swap(input, j, l);
        return j;
    }
    public void swap(int[] input, int i, int j){
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
}



//维护一个大小为k的大顶堆
import java.util.*;
public class Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(input == null || input.length == 0 || k <= 0 || k > input.length)
            return res;
        PriorityQueue<Integer> queue = new PriorityQueue<>((o1,o2)->(o2-o1));
        for(int num : input){
            queue.add(num);
            if(queue.size() > k) queue.poll();
        }
        for(int i = 0; i < k; i++){
            res.add(queue.poll());
        }
        return res;
    }
}