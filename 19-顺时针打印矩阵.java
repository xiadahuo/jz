//递归
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> res = new ArrayList<>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return res;
        print(matrix, 0,0, matrix.length-1, matrix[0].length-1,res);
        return res;
    }
    public void print(int[][] matrix, int top, int left, int bottom,
                     int right, ArrayList<Integer> res){
        if(left > right || top > bottom) return;
        if(top == bottom){
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
            return;
        }else if(left == right){
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][left]);
            }
            return;
        }else{
            for(int i = left; i <= right-1;i++){
                res.add(matrix[top][i]);
            }
            for(int i = top; i <= bottom-1; i++){
                res.add(matrix[i][right]);
            }
            for(int i = right; i >= left+1; i--){
                res.add(matrix[bottom][i]);
            }
            for(int i = bottom; i > top; i--){
                res.add(matrix[i][left]);
            }
            print(matrix, ++top, ++left, --bottom, --right, res);
        }
    }
}

//防止栈溢出
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
       ArrayList<Integer> res = new ArrayList<>();
       if(matrix == null || matrix.length==0 || matrix[0].length == 0)
           return res;
        int top = 0, left = 0, bottom = matrix.length-1, right = matrix[0].length-1;
        while(top <= bottom && left <= right){
            print(matrix, top++, left++, bottom--, right--, res);
        }
        return res;
    }
    public void print(int[][] matrix, int top, int left, int bottom, int right,
                     ArrayList<Integer> res){
        if(top == bottom){
            for(int i = left; i <= right; i++){
                res.add(matrix[top][i]);
            }
        }else if(left == right){
            for(int i = top; i <= bottom; i++){
                res.add(matrix[i][left]);
            }
        }else{
            for(int i = left; i < right; i++){
                res.add(matrix[top][i]);
            }
            for(int i = top; i < bottom; i++){
                res.add(matrix[i][right]);
            }
            for(int i = right; i > left; i--){
                res.add(matrix[bottom][i]);
            }
            for(int i = bottom; i > top; i--){
                res.add(matrix[i][left]);
            }
        }
    }
}











