public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i = 0; i < length; i++){
            while(numbers[i] != i && numbers[numbers[i]] != numbers[i]){
                swap(numbers, numbers[i], i);
            }
        }
        for(int i = 0; i < length; i++){
            if(numbers[i] != i){
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    public void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}




public class Solution {
    // Parameters:
    //    numbers:     an array of integers
    //    length:      the length of array numbers
    //    duplication: (Output) the duplicated number in the array number,length of duplication array is 1,so using duplication[0] = ? in implementation;
    //                  Here duplication like pointor in C/C++, duplication[0] equal *duplication in C/C++
    //    这里要特别注意~返回任意重复的一个，赋值duplication[0]
    // Return value:       true if the input is valid, and there are some duplications in the array number
    //                     otherwise false
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        for(int i = 0; i < length; i++){
            while(numbers[i] != i && numbers[numbers[i]] != numbers[i]){   //每次把numbers[i]放到正确的位置上
                swap(numbers, numbers[i], i);
            }
            if(numbers[i] != i){                      //如果numbers[i】没有放到应该交换的位置上，说明重复了。
                duplication[0] = numbers[i];
                return true;
            }
        }
        return false;
    }
    public void swap(int[] numbers, int i, int j){
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }
}