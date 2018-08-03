package xyz.marsj.dp;
/**
 * 假设你正在爬楼梯。需要 n 步你才能到达楼顶。
	每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
	注意：给定 n 是一个正整数。
	示例 1：
	输入： 2
	输出： 2
	解释： 有两种方法可以爬到楼顶。
	1.  1 步 + 1 步
	2.  2 步
 * @author sj
 *
 */
public class ClimbStairs {
	   public int climbStairs(int n) {
	        int[] sum=new int[n+1];
	        sum[0]=1;
	        sum[1]=1;
	        for(int i=2;i<=n;i++){
	            sum[i]=sum[i-1]+sum[i-2];
	        }
	        return sum[n];
	    }
}
