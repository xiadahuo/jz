public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int max = array[0];
        int sum = array[0];
        for(int i = 1; i < array.length; i++){
            sum = sum >= 0 ? sum+array[i] : array[i]; //如果前一段为负数，舍弃
            if(sum > max){
                max = sum;
            }
        }
        return max;
    }
}



public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int[] dp = new int[array.length]; // dp[i]为以array[i]为末尾的最大的子数组和
        dp[0] = array[0];
        for(int i = 1; i < array.length; i++){
            dp[i] = dp[i-1] >= 0 ? array[i] + dp[i-1] : array[i];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(dp[i] > max) max = dp[i];
        }
        return max;
    }
}

public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array == null || array.length == 0) return 0;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int num : array){
            if(sum < 0) sum = 0;
            sum += num;
            if(sum > max) max = sum;
        }
        return max;
    }
}