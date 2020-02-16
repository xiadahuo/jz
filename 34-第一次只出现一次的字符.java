import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0) return -1;
        char[] chars = str.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i < chars.length; i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i], map.get(chars[i])+1);
            }else{
                map.put(chars[i],1);
            }
        }
        for(int i = 0; i < chars.length; i++){
            if(map.get(chars[i]) == 1) return i;
        }
        return -1;
    }
}


//acsii码
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length()==0) return -1;
        int[] chars = new int[128];  //ascii码个数
        for(int i = 0; i < str.length(); i++){
            chars[str.charAt(i)]++;
        }
        for(int i = 0; i < str.length(); i++){
            if(chars[str.charAt(i)] == 1) return i;
        }
        return -1;
    }
}


//BitSet减少空间
import java.util.*;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        if(str == null || str.length() == 0) return -1;
        BitSet b1 = new BitSet(128);
        BitSet b2 = new BitSet(128);
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(!b1.get(c) && !b2.get(c)){   // 00->01   （只出现一次）
                b1.set(c);         
            }else if(b1.get(c) && !b2.get(c)){   // 01->11   （出现第二次的时候）
                b2.set(c);         
            }
        }
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(b1.get(c) && !b2.get(c)) return i;  //如果 01 （代表只出现一次）
        }
        return -1;
    }
}