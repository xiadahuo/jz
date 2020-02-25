public class Solution {
    public String LeftRotateString(String str,int n) {
        if(str == null || str.length()== 0) return "";
        char[] chars = str.toCharArray();
        n = n % str.length();
        reverse(chars, 0, n-1);
        reverse(chars, n, str.length()-1);
        reverse(chars, 0, str.length()-1);
        return new String(chars);
    }
    public void reverse(char[] chars, int start, int end){
        while(start < end){
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}