import java.util.*;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if(map.containsKey(array[i])){
                map.put(array[i],map.get(array[i])+1);
            }else{
                map.put(array[i], 1);
            }
            if(map.get(array[i]) > array.length/2) return array[i];
        }
        return 0;
    }
}

public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) return 0;
        int majority = array[0], cnt = 1;  //初始化
        for(int i = 1; i < array.length; i++){
            cnt = array[i] == majority ? cnt+1 : cnt-1;
            if(cnt == 0){
                majority = array[i];
                cnt = 1;
            }
        }
        cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] == majority)
                cnt++;
        }
        return cnt > array.length/2 ? majority : 0;
    }
}




public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        if(array == null || array.length == 0) return 0;
        int val = -1, cnt = 0;
        for(int num : array){
            if(cnt == 0){
                val = num;
                cnt = 1;
            }else{
                if(val == num) cnt++;
                else cnt--;
            }
        }
        cnt = 0;
        for(int num : array){
            if(num == val) cnt++;
        }
        return cnt > array.length/2 ? val : 0;
    }
}









