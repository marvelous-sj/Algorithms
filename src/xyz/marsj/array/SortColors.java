package xyz.marsj.array;
/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
	此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
	注意:
	不能使用代码库中的排序函数来解决这道题。
	示例:
	输入: [2,0,2,1,1,0]
	输出: [0,0,1,1,2,2]
 * @author sj
 *
 */
public class SortColors {
	public void sortColors(int[] nums) {
        int zero=-1;//[0,length]
        int temp;
        int two=nums.length;//[two,length-1]
        for(int i=0;i<two;){
        	if(nums[i]==1){
        		i++;
        	}else if(nums[i]==2){
        		two--;
        		temp = nums[i];
				nums[i] = nums[two];
				nums[two]= temp;
        	}else{
        		//nums[i]==0
        		zero++;
        		temp = nums[i];
				nums[i] = nums[zero];
				nums[zero]= temp;
				i++;
        	}
        }
    }

}
