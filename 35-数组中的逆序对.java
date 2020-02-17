public class Solution {
    private int[] temp;
    public int InversePairs(int [] array) {
        if(array == null || array.length == 0) return 0;
        temp = new int[array.length];
        return merge(array, 0, array.length-1);
    }
    public int merge(int[] array, int l, int r){
        if(l >= r) return 0;
        int mid = (r-l)/2 +l;  //防止溢出
        int res = merge(array,l,mid) + merge(array, mid+1,r); //先排左右两部分再最终归并
        int i = l, j = mid+1;
        int index = l;
        while(i <= mid && j <= r){
            if(array[i] <= array[j]) temp[index++] = array[i++];
            else{   //逆序则累加
                temp[index++] = array[j++];
                res = (res+mid-i+1) % 1000000007; //防止溢出
            }
        }
        while(i <= mid) temp[index++] = array[i++];
        while(j <= r) temp[index++] = array[j++];
        for(int k = l; k <= r; k++) array[k] = temp[k];
        return res;
    }
}