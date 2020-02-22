//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 0) return;
        int sum = 0;
        for(int val : array){
            sum ^= val;
        }
        int k = 0;
        while(((sum >> k) & 1)==0) k++;   //和的某一位不为0，以此分成两组
        num1[0] = 0; num2[0] = 0; //初始化
        for(int val : array){
            if(((val >> k) & 1) == 0) num1[0] ^= val;
            else num2[0] ^= val;
        }
    }
}




//通过与相反数相与。 负数为补码+1，找到最右边不为0的位
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果
public class Solution {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        if(array == null || array.length == 0) return;
        int sum = 0;
        for(int val : array){
            sum ^= val;
        }
        int diff = (sum &= -sum);  //找到最右边不为0的数， 1100 & 0100 = 0100 
        num1[0] = 0; num2[0] = 0;
        for(int val : array){
            if((val & diff) == 0) num1[0] ^= val;
            else num2[0] ^= val;
        }
    }
}