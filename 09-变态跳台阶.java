public class Solution {
    public int JumpFloorII(int target) {
        if(target < 2) return target;
        int[] dp = new int[target+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2; i <= target; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j];
            }
        }
        return dp[target];
    }
}