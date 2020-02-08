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