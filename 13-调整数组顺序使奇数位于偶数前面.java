//额外空间
public class Solution {
    public void reOrderArray(int [] array) {
        if(array == null || array.length == 0) return;
        int[] temp = new int[array.length];
        int cnt = 0;
        for(int i = 0; i < array.length; i++){
            if(!isEven(array[i])){
                temp[cnt++] = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            if(isEven(array[i])){
                temp[cnt++] = array[i];
            }
        }
        for(int i = 0; i < array.length; i++){
            array[i] = temp[i];
        }
    }
    public boolean isEven(int a){
        return a % 2 == 0;
    }
    
}

//冒泡思想
public class Solution {
    public void reOrderArray(int [] array) {
        if(array == null || array.length == 0) return;
        for(int i = array.length-1 ; i > 0; i--){
            for(int j = 0; j < i; j++){ //每次通过交换确定最右边的偶数
                if(isEven(array[j]) && !isEven(array[j+1])){
                    swap(array, j, j+1);
                }
            }
        }
    }
    public void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public boolean isEven(int a){
        return a % 2 == 0;
    }
}