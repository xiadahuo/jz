public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.length()==0) return "";
        if(str.trim().equals("")) return str;
        String[] temp = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = temp.length-1; i >= 0; i--){
            sb.append(temp[i]);
            if(i != 0) sb.append(" ");
        }
        return sb.toString();
    }
}


public class Solution {
    public String ReverseSentence(String str) {
        if(str == null || str.length() == 0) return "";
        if(str.trim().equals("")) return str;
        char[] chars = str.toCharArray();
        for(int i = 0; i < chars.length; i++){
            int j = i;
            while(j < chars.length && chars[j] != ' ') j++;
            reverse(chars, i, j-1);
            i = j;
        }
        reverse(chars, 0, chars.length-1);
        return new String(chars);
    }
    public void reverse(char[] chars, int i, int j){
        while(i < j){
            swap(chars, i++, j--);
        }
    }
    public void swap(char[] chars, int i, int j){
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}