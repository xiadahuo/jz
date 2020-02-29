public class Solution {
    public int Sum_Solution(int n) {
        int sum = 0;
        boolean a =  (n>=1) && ((sum = Sum_Solution(n-1)+n)>=0);
        return sum;
    }
}