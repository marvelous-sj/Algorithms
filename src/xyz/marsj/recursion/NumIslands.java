package xyz.marsj.recursion;
/**200
 * 给定一个由 '1'（陆地）和 '0'（水）组成的的二维网格，计算岛屿的数量。一个岛被水包围，并且它是通过水平方向或垂直方向上相邻的陆地连接而成的。你可以假设网格的四个边均被水包围。
	示例 1:
	输入:
	11110
	11010
	11000
	00000
	输出: 1
 * @author sj
 *
 */
public class NumIslands {
	int[][] move={{-1,0},{0,1},{1,0},{0,-1}};
    int m,n;
    int[][] visited;
    private boolean inArea(int x,int y){
        if(x>=0&&x<m&&y>=0&&y<n){
            return true;
        }
        return false;
    }
    private void dfs(char[][] grid,int x,int y){
        visited[x][y]=1;
        for(int i=0;i<4;i++){
            int newx=x+move[i][0];
            int newy=y+move[i][1];
            if(inArea(newx,newy)&&grid[newx][newy]=='1'&&visited[newx][newy]==0)
                dfs(grid,newx,newy);
        }
    }
    public int numIslands(char[][] grid) {
        int res=0;
        m=grid.length;
        if(m==0){
            return 0;
        }
        n=grid[0].length;
        visited=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'&&visited[i][j]==0){
                    res++;
                    dfs(grid,i,j);
                }  
            }
        }
        return res;
    }
}
