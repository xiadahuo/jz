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