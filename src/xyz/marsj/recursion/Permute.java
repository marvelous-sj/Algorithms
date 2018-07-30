package xyz.marsj.recursion;
import java.util.ArrayList;
import java.util.List;
/** 46
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
	示例:
	输入: [1,2,3]
	输出:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
 * @author sj
 *
 */
public class Permute {
	 List<List<Integer>> res=new ArrayList<>();
	    public List<List<Integer>> permute(int[] nums) {
	        List<Integer> list=new ArrayList<>();
	        if(nums.length==0){
	            return res;
	        }
	        doPermute(nums,0,list);
	        return res;
	    }
	    private void doPermute(int[]nums,int index,List<Integer> list){
	        if(index==nums.length){
	            res.add(new ArrayList<>(list));
	            return;
	        }
	        for(int i=0;i<nums.length;i++){
	            if(!list.contains(nums[i])){
	                list.add(nums[i]);
	                doPermute(nums,index+1,list);
	                list.remove(list.size()-1);
	            }
	        }
	    }
}
