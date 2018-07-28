package xyz.marsj.array;
/**3
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
	示例：
	给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
	给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
	给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 * @author sj
 *
 */
public class LengthOfLongestSubstring {
	 public int lengthOfLongestSubstring(String s) {
	        char[] array=s.toCharArray();
	        int[] freq=new int[256];
	        int l=0,r=-1;
	        int res=0;
	        while(l<array.length){
	            if(r+1<array.length&&freq[array[r+1]]==0){
	                r++;
	                freq[array[r]]++;
	            }else{
	                freq[array[l]]--;
	                l++;
	            }
	            res=Math.max(res,r-l+1);
	        }
	            return res;
	    }
}
