public class Solution {
    public int Add(int num1,int num2) {
        while(num2 != 0){
            int sum = num1 ^ num2;     //非进位加法
            int carry = (num1 & num2) << 1;  //进位
            num1 = sum;
            num2 = carry;
        }
        return num1;
    }
}




public class Solution {
    public int Add(int num1,int num2) {
        return num2 == 0 ? num1 : Add(num1^num2, (num1&num2)<<1);
    }
}