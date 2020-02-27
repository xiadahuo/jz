import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5) return false;
        Arrays.sort(numbers);
        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0) k++; //记录癞子个数
        }
        for(int i = k; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]) return false; //有对子
            k -= numbers[i+1]- numbers[i]-1; //用癞子抵差距
        }
        return k >= 0;
    }
}



import java.util.*;
public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5) return false;
        Arrays.sort(numbers);
        int k = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == 0) k++; // 删0
        }
        for(int i = k; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]) return false; //有对子
        }
        return numbers[numbers.length-1]-numbers[k] <= 4; //非零最多相差4
    }
}