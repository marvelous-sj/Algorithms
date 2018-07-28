package xyz.marsj.array;
/**125
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
	说明：本题中，我们将空字符串定义为有效的回文串。
	示例 1:
	输入: "A man, a plan, a canal: Panama"
	输出: true
 * @author sj
 *
 */
public class IsPalindrome {
	public boolean isPalindrome(String s) {
        char[] array = s.toCharArray();
        int l=0,r=array.length-1;
        while(l<r){
        	if(!isChar(array[l])){
        		l++;
        		continue;
        	}
        	if(!isChar(array[r])){
        		r--;
        		continue;
        	}
        	if(array[l]==array[r]||(Math.abs(array[l]-array[r])==32)&&(array[l]+array[r])>=162){
        		l++;
        		r--;
        	}else{
        		return false;
        	}
        }
		return true;
        
    }

	private boolean isChar(char c) {
		if(c<48||(c>57&&c<65)||(c>90&&c<97)||c>122){
			return false;			
		}
		return true;
	}
	
	public static void main(String[] args) {
		IsPalindrome is=new IsPalindrome();
		boolean b = is.isPalindrome("pP");
		System.out.println(b);
	}
}
