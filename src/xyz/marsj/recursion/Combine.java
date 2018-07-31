package xyz.marsj.recursion;

import java.util.ArrayList;
import java.util.List;

/**77
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
	示例:
	输入: n = 4, k = 2
	输出:
	[
  	[2,4],
  	[3,4],
  	[2,3],
  	[1,2],
  	[1,3],
  	[1,4],
	]
 * @author sj
 *
 */
public class Combine {
	List<List<Integer>> res=new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<>();
        doCombine(n,k,1,list);
        return res;
    }
    private void doCombine(int n,int k,int start,List<Integer> list){
        if(k==list.size()){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int i=start;i<=n-(k-list.size())+1;i++){
            list.add(i);
            doCombine(n,k,i+1,list);
            list.remove(list.size()-1);
        }
    }
}
