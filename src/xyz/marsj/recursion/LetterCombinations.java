package xyz.marsj.recursion;

import java.util.ArrayList;
import java.util.List;

/** 17
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
	给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
	示例:
	输入："23"
	输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * @author sj
 *
 */
public class LetterCombinations {
    List<String> res=new ArrayList<>();
    String[] array={" ","","abc","def","ghi","jkl","mon","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits.equals("")){
            return res;
        }
        findCombination(digits,0,"");
        return res;
    }
    private void findCombination(String digits,int index,String s){
        if(index==digits.length()){
            res.add(s);
            return;
        }
        char x=digits.charAt(index);
        String str=array[x-'0'];
        char[] c=str.toCharArray();
        for(int i=0;i<c.length;i++){
            findCombination(digits,index+1,s+c[i]);
        }
    }
    
  public static void main(String[] args) {
	LetterCombinations l=new LetterCombinations();
	List<String> list = l.letterCombinations("");
	for (String string : list) {
		System.out.println(string);
		
	}
	
}
}
