package xyz.marsj.recursion;

import java.util.ArrayList;
import java.util.List;

/**79
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
	单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
	示例:
	board =
	[
  	['A','B','C','E'],
  	['S','F','C','S'],
  	['A','D','E','E']
	]
	给定 word = "ABCCED", 返回 true.
	给定 word = "SEE", 返回 true.
	给定 word = "ABCB", 返回 false.
 * @author sj
 *
 */
public class Exist {
	int[][] move={{-1,0},{0,1},{1,0},{0,-1}};
	  int[][] visited;
	  int m,n;
	  public  boolean exist(char[][] board, String word) {
		  m=board.length;
		  n=board[0].length;
		  visited=new int[m][n];
	        for(int i=0;i<board.length;i++){
	        	for(int j=0;j<board[i].length;j++){
	        		if(searchWord(board,word,0,i,j))
	        			return true;
	        	}
	        }
			return false;
	    }
	  
	  private  boolean searchWord(char[][] board, String word, int index, int startx, int starty) {
		if(index==word.length()-1){
			return board[startx][starty]==word.charAt(index);
		}
		if(board[startx][starty]==word.charAt(index)){
			visited[startx][starty]=1;
			//上右下左找
			for(int i=0;i<4;i++){
				int newx=startx+move[i][0];
				int newy=starty+move[i][1];
				if(inArea(newx,newy)&&visited[newx][newy]==0)
					if(searchWord(board, word, index+1, newx, newy))
						return true;

			}
			visited[startx][starty]=0;
		}
		return false;
		
	}

	private boolean inArea(int newx, int newy) {
		if(newx>=0&&newx<m&&newy>=0&&newy<n){
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
//		Exist e=new Exist();
//		char[][] board={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//		boolean exist = e.exist(board, "ABCCED");
//		System.out.println(exist);
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(50);
		StringBuilder sb=new StringBuilder();
		sb.append("w");
		sb.append("c");
		String sb1=new String("dd");
				
		System.out.println(sb1.toString());
	}
}
