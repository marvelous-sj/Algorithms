package xyz.marsj.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**47
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
	示例:
	输入: [1,1,2]
	输出:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
 * @author sj
 *
 */
public class PermuteUnique {

    static List<List<Integer>> res=new ArrayList<>();
    int [] pos;
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list =new ArrayList<>();
        if(nums.length==0)
            return res;
        pos=new int[nums.length];
        Arrays.sort(nums);
        doPermute(nums,0,list);
        return res;
    }
    
    private void doPermute(int[] nums , int index, List<Integer> list){
        if(nums.length==index){
           res.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=0;i<nums.length;i++){
            if(pos[i]==0){
            	pos[i]=1;
                list.add(nums[i]);
                doPermute(nums,index+1,list);
                pos[i]=0;
                list.remove(list.size()-1);
                while(i<nums.length-1&&nums[i]==nums[i+1]){
                    i++;
                }
            }
        }
    }
    
    public static void main(String[] args) {
    	PermuteUnique p=new PermuteUnique();
    	int[] arr={1,1,2};
    	p.permuteUnique(arr);
    	for (List<Integer> i : res) {
			System.out.println(i);
		}
    	
	}
}
