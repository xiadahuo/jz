//递归
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0) return 1;
        if(exponent == 1) return base;
        boolean isNegative = false;
        if(exponent < 0){
            isNegative = true;
            exponent = -exponent;
        }
        double res = Power(base*base, exponent / 2);
        if(exponent % 2 == 1) res *= base; 
        return isNegative ? 1.0/res : res;
    }
}
//递归+位运算
public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0) return 1;
        if(exponent == 1) return base;
        boolean isNegative = false;
        if(exponent < 0){
            isNegative = true;
            exponent = -exponent;
        }
        double res = Power(base*base, exponent >> 1);
        if((exponent & 1) == 1) res *= base;
        return isNegative ? 1.0/res : res;
    }
}


//直接计算
public class Solution {
    public double Power(double base, int exponent) {
        double res = 1.0;
        int cnt = Math.abs(exponent);
        for(int i = 0; i < cnt; i++){
            res *= base;
        }
        return exponent < 0 ? 1.0/res : res;
    }
}