package xyz.marsj.dp;

import java.util.List;

/**120
 * 给定一个三角形，找出自顶向下的最小路径和。每一步只能移动到下一行中相邻的结点上。
	例如，给定三角形：
[
     [2],
    [3,4],
   [6,5,7],
  [4,1,8,3]
]
	自顶向下的最小路径和为 11（即，2 + 3 + 5 + 1 = 11）。
 * @author sj
 *
 */
public class MinimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n= triangle.size();
        if(n==0) return 0;
        int res[]=new int[n+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                res[j]=Math.min(res[j],res[j+1])+triangle.get(i).get(j);
            }
        }
            return res[0];
    }
}
