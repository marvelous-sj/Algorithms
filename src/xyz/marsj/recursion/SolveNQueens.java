package xyz.marsj.recursion;

import java.util.ArrayList;
import java.util.List;

/** 51
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
	上图为 8 皇后问题的一种解法。
	给定一个整数 n，返回所有不同的 n 皇后问题的解决方案。
	每一种解法包含一个明确的 n 皇后问题的棋子放置方案，该方案中 'Q' 和 '.' 分别代表了皇后和空位。
	示例:
	输入: 4
	输出: [
 	[".Q..",  // 解法 1
  	"...Q",
  	"Q...",
  	"..Q."],
 	["..Q.",  // 解法 2
  	"Q...",
  	"...Q",
  	".Q.."]
	]
 * @author sj
 *
 */
public class SolveNQueens {
    int[] col;
    int[] a;
    int[] b;
     List<List<String>> res=new ArrayList<>();
    private void putQueen(int n,int index,List<Integer> list){
        if(n==index){
            res.add(generteIndex(n,new ArrayList<>(list)));
            return;
        }
        for(int j=0;j<n;j++){
            if(col[j]==0&&a[index+j]==0&&b[j-index+n-1]==0){
                list.add(j);
                col[j]=1;
                a[index+j]=1;
                b[j-index+n-1]=1;
                putQueen(n,index+1,list);
                col[j]=0;
                a[index+j]=0;
                b[j-index+n-1]=0;
                list.remove(list.size()-1);
            }
        }
    }
    private List<String> generteIndex(int n,List<Integer> list){
        List<String> string=new ArrayList<>();
        
        for(int i=0;i<n;i++){
             String s="";
            for(int j=0;j<n;j++){
                if(j==list.get(i)){
                    s+="Q";
                }else{
                    s+=".";
                }
            }
             string.add(s);
        }
        return string;
    }
    public List<List<String>> solveNQueens(int n) {
        col=new int[n];
        a=new int[2*n-1];
        b=new int[2*n-1];
        List<Integer> list=new ArrayList<>();
        putQueen(n,0,list);
        return res;
    }
}
