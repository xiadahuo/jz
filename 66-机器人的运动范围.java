public class Solution {
    private int cnt = 0;
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] vis = new boolean[rows][cols];
        dfs(vis, threshold, 0, 0);
        return cnt;
    }
    public void dfs(boolean[][] vis, int threshold, int x, int y){
        if(x < 0 || x >= vis.length || y < 0 || y >= vis[0].length || vis[x][y] == true) return;
        vis[x][y] = true;
        int sum = getSum(x,y);
        if(sum > threshold) return;
        cnt++;
        int[] dx = {0,-1,0,1}; int[] dy = {-1,0,1,0};
        for(int k = 0; k < 4; k++){
            int a = x + dx[k];
            int b = y + dy[k];
            dfs(vis, threshold, a, b);
        }
    }
    public int getSum(int rows, int cols){
        int res = 0;
        while(rows != 0){
            res += rows % 10;
            rows /= 10;
        }
        while(cols != 0){
            res += cols % 10;
            cols /= 10;
        }
        return res;
    }
}