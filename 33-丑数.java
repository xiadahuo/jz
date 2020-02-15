public class Solution {
    public int GetUglyNumber_Solution(int index) {
        if(index <= 0) return 0;
        int[] dp = new int[index];
        dp[0] = 1;
        int p2 = 0, p3 = 0, p5 = 0; //记录下数组中每个数乘2、3、5后 待加入数组的索引。
        for(int i = 1; i < index; i++){
            int temp = Math.min(dp[p2]*2, Math.min(dp[p3]*3, dp[p5]*5));
            dp[i] = temp;
            if(dp[p2]*2 == temp) p2++;
            if(dp[p3]*3 == temp) p3++;
            if(dp[p5]*5 == temp) p5++;
        }
        return dp[index-1];
     }
}