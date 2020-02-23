import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       if(sum < 3) return res;
        for(int i = 1, j = 1, s = 0; i <= sum; i++){
            while(s < sum) s = s + (j++);
            if(s == sum && j-i > 1){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = i; k < j; k++){
                    list.add(k);
                }
                res.add(list);
            }
            s -= i;
        }
        return res;
    }
}



import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<>();
       if(sum < 3) return res;
        for(int i = 1, j = 1, s = 1; i <= sum; i++){   
            while(s < sum) s = s + (++j);
            if(s == sum && j-i > 0){
                ArrayList<Integer> list = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    list.add(k);
                }
                res.add(list);
            }
            s -= i;
        }
        return res;
    }
}



import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(sum < 3) return res;
        int start = 1, end = 2,curSum = 3;
        while(end < sum){
            if(curSum == sum){
                ArrayList<Integer> list = new ArrayList<>();
                for(int i = start; i <= end; i++){
                    list.add(i);
                }
                res.add(list);
                curSum -= start++;
            }else if(curSum < sum){
                while(curSum < sum) curSum += (++end);
            }else{
                while(curSum > sum) curSum -= (start++);
            }
        }
        return res;
    }
}