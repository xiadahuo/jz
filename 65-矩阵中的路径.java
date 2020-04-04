public class Solution {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix == null || matrix.length == 0 || rows <= 0 || cols <= 0)return false;
        char[][] map = build(matrix, rows, cols);
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(dfs(map, i, j, str,0)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] map, int i, int j, char[] str, int index){
        if(str[index] != map[i][j]) return false;
        if(index == str.length-1) return true;
        char t = map[i][j];
        map[i][j] = '#';
        int[] dx = {-1,0,1,0}; int[] dy = {0, 1, 0, -1};
        for(int k = 0; k < 4; k++){
            int a = i+dx[k]; int b = j+dy[k];
            if(a < 0 || a >= map.length || b < 0 || b >= map[0].length) continue;
            if(dfs(map, a, b, str, index+1))
                return true;
        }
        map[i][j] = t;
        return false;
    }
    public char[][] build(char[] matrix, int rows, int cols){
        char[][] map = new char[rows][cols];
        int count = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                map[i][j] = matrix[count++];
            }
        }
        return map;
    }
}