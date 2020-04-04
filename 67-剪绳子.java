/*
证明 n >= 5 时(n-3)*3>n恒成立         (n-3)*3 > n 等价于2n > 9 等价于n > 4.5  所以n >= 5 时候恒成立  所以要拆分出足够多的3

当n=5时，拆成2,3  乘积为6 ， 当n=4时 拆成2*2,而不是3*1;
*/
public class Solution {
    public int cutRope(int target) {
        if(target <= 3) return 1*(target-1);
        //拆成尽可能多的3
        int n3 = 0, n2 = 0;  //n3表示3的个数， n2 表示2的个数
        if(target % 3 == 0){
            n3 = target / 3;
        }else if(target % 3 == 1){
            n3 = (target-1) / 3 - 1;
            n2 = 2;
        }else{
            n3 = (target-2) / 3;
            n2 = 1;
        }
        double res = Math.pow(2,n2) * Math.pow(3,n3);
        return (int) res;
    }
}

//动态规划
public class Solution {
    public int cutRope(int target) {
        int[] dp = new int[target+1];
        dp[1] = 1;
        for(int i = 2; i <= target; i++){
            for(int j = 1; j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(dp[i-j]*j , (i-j)*j));
            }
        }
        return dp[target];
    }
}