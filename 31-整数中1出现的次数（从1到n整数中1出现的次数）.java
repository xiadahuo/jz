//暴力解法
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int i = 1; i <= n; i++){
            res += NumberOf1(i);
        }
        return res;
    }
    public int NumberOf1(int n){
        int cnt = 0;
        while(n != 0){
            if(n % 10 == 1) cnt++;
            n = n / 10;
        }
        return cnt;
    }
}


//找规律
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int res = 0;
        for(int m = 1; m <= n; m*=10 ){
            int a = n / m, b = n % m;
            res += (a+8)/10 * m + (a%10==1 ? b+1 : 0);
        }
        return res;
    }
}