package xyz.marsj.dp;
/** 279
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
	示例 1:
	输入: n = 12
	输出: 3 
	解释: 12 = 4 + 4 + 4.
 * @author sj
 *
 */
public class NumSquares {
	public int numSquares(int n) {
		int res[]=new int[n+1];
		res[1]=1;
		for(int i=2;i<=n;i++){
			res[i]=Integer.MAX_VALUE;
		}
		for(int i=2;i<=i;i++){
			for(int j=1;j*j<=n;j++){
				res[i]=Math.min(res[i], res[i-j*j]+1);
			}
		}
		return res[n];
    }
}
