import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res = new ArrayList<>();
        if(str == null || str.length() == 0) return res;
       char[] c = str.toCharArray();
        Arrays.sort(c);
        boolean[] isUsed = new boolean[str.length()];
        helper(res, c, isUsed, new StringBuilder());
        return res;
    }
    public void helper(ArrayList<String> res, char[] c, boolean[] isUsed,
                      StringBuilder sb){
        if(sb.length() == c.length){
            res.add(sb.toString());
            return;
        }
        for(int i = 0; i < c.length; i++){
            if(isUsed[i] || i != 0 && isUsed[i-1] == false && c[i] == c[i-1])
                continue;
            isUsed[i] = true;
            sb.append(c[i]);
            helper(res, c, isUsed, sb);
            isUsed[i] = false;
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

//法二：交换
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res = new ArrayList<>();
        if(str == null || str.length()== 0) return res;
        char[] c = str.toCharArray();
        Arrays.sort(c);
        helper(res, c, 0, str.length());
        Collections.sort(res);
        return res;
    }
    public void helper(ArrayList<String> res, char[] c, int index, int end){
        if(index == end){
            res.add(new String(c));
        }else{
            for(int i = index; i < end; i++){
                if(i == index || c[i] != c[index]){
                    swap(c,i,index);
                    helper(res, c, index+1, end);
                    swap(c,i,index);
                }
            }
        }
        
    }
    public void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}


//字典序法
import java.util.*;
public class Solution {
    public ArrayList<String> Permutation(String str) {
       ArrayList<String> res = new ArrayList<>();
        if(str == null || str.length() == 0) return res;
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        res.add(new String(chars));
        int len = str.length();
        while(true){
            int l = len-1; // l-1表示从右边往左，第一个小于右边元素的index
            while(l > 0 && chars[l-1] >= chars[l])
                l--;
            if(l == 0) break;
            int r = len-1;
            while(r > l && chars[r] <= chars[l-1]) //r表示从右到左第一个比l-1大的数字
                r--;
            swap(chars, l-1, r); //交换l-1 和 r 位置的字母
            reverse(chars,l);     //将l-1后的数字逆序
            res.add(new String(chars));
        }
        return res;
    }
    public void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public void reverse(char[] chars, int l){
        int r = chars.length-1;
        while(l < r){
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
    }
}






