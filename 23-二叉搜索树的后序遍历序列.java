public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) return false;
        return helper(sequence, 0, sequence.length-1);
    }
    public boolean helper(int[] sequence, int l, int r){
        if(l >= r) return true;
        int back = sequence[r];
        int index = l;
        while(index < r && sequence[index] <= back) index++;
        for(int i = index; i < r; i++){
            if(sequence[i] < back) return false;
        }
        return helper(sequence, l, index-1) && helper(sequence, index+1,r-1);
    }
}