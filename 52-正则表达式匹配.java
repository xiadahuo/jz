public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str == null || pattern == null) return true;
        int m = str.length;
        int n = pattern.length;
        boolean[][] dp = new boolean[m+1][n+1];
        dp[0][0] = true;
        for(int j = 0; j < n; j++){
            if(pattern[j] == '*'){
                dp[0][j+1] = dp[0][j-1];
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(str[i] == pattern[j] || pattern[j] == '.') //s[i] 与 p[j]相等
                    dp[i+1][j+1] = dp[i][j];
                if(pattern[j] == '*'){  //s[i]与p[j]不相等
                    if(pattern[j-1] != str[i] && pattern[j-1] != '.') dp[i+1][j+1] = dp[i+1][j-1];  //完全不匹配， 去掉pattern的 后两个字母
                    else dp[i+1][j+1] = dp[i+1][j-1] || dp[i][j+1];              //可能匹配，匹配0个或多个
                }
            }
        }
        return dp[m][n];
    }
}







