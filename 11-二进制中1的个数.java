public class Solution {
    public int NumberOf1(int n) {
        int cnt = 0;  //计数
        while(n != 0){
            n = n & (n-1); //每次把最后一位1抹去
            cnt++;
        }
        return cnt;
    }
}