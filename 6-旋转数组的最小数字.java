import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0) return 0;
        int l = 0, r = array.length-1;
        int back = array[array.length-1];
        while(l < r){
            int mid = (r-l)/2 + l;
            if(array[mid] <= back) r = mid;
            else l = mid+1;
        }
        return array[l];
    }
}