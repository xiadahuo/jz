//暴力 O(n)
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
       int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == k) cnt++;
        }
        return cnt;
    }
}


// 二分 O(log n)
public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        if(array == null || array.length == 0) return 0;
       int l = 0, r = array.length-1;
        while(l < r){
            int mid = l+r >> 1;
            if(array[mid] >= k) r = mid;
            else l = mid+1;
        }
        if(array[l] != k) return 0;   //不存在返回0
        int start = l;  //第一个位置
        l = 0; r = array.length-1;
        while(l < r){
            int mid = l+r+1 >> 1;
            if(array[mid] <= k) l = mid;
            else r = mid -1;
        }
        int end = l;  //最后一个位置
        return end-start+1;
    }
}