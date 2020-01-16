public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array == null || array.length == 0 || array[0].length == 0)
            return false;
        int row = array.length-1;
        int col = array[0].length-1;
        int i = 0, j = array[0].length-1;//初始化，取第一行最后一个元素
        while(i <= row &&  j >= 0){
            if(array[i][j] == target){
                return true;
            }else if(array[i][j] > target){ // 如果大于目标值，往左移动
                j--;
            }else{    //如果小于目标值，向下移动
                i++;
            }
        }
        return false;  //遍历完未找到
    }
}