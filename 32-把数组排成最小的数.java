//lambda表达式版本
import java.util.*;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
    	if(numbers == null || numbers.length == 0) return "";
        String[] nums = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, (s1,s2)->(s1+s2).compareTo(s2+s1));
        StringBuilder sb = new StringBuilder();
        for(String str : nums){
            sb.append(str);
        }
        return sb.toString();
    }
}


import java.util.*;
public class Solution {
    public String PrintMinNumber(int [] numbers) {
    	if(numbers == null || numbers.length == 0) return "";
        String[] nums = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                String res1 = str1+str2;
                String res2 = str2+str1;
                return res1.compareTo(res2);
            }
        });
        StringBuilder sb = new StringBuilder();
        for(String str : nums){
            sb.append(str);
        }
        return sb.toString();
    }
}