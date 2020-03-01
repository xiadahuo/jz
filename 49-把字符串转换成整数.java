public class Solution {
    public int StrToInt(String str) {
        if(str == null || str.length() == 0) return 0;
        boolean isNegative = str.charAt(0) == '-' ? true : false;
        long res = 0;
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(i == 0){
                if(c == '+' || c == '-') continue; //去掉符号位
            }
            if(c < '0' || c > '9') return 0; //如果有除数字外的符号
            res = res * 10 + c - '0';
        }
        if(isNegative) res = res * (-1);  //负数处理
        if(res < Integer.MIN_VALUE || res > Integer.MAX_VALUE) return 0; //越界处理
        return (int) res;
    }
}