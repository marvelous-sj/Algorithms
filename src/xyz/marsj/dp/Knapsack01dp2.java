package xyz.marsj.dp;

import java.util.ArrayList;
import java.util.List;
/**
 * 01背包动态规划求解
 * 优化空间复杂度为O(C)
 * @author sj
 *
 */
public class Knapsack01dp2 {
	public int knapsack01dp(List<Integer> w,List<Integer> v,int C){
		int n=w.size();
		int memo[]=new int[C+1];
		if(n==0){
			return 0;
		}
	
		for(int j=0;j<=C;j++){
			if(j>=w.get(0)){
				memo[j]=v.get(0);				
			}else{
				memo[j]=0;
			}
		}
		for(int i=1;i<n;i++){
			for(int j=C;j>=w.get(i);j--){
				memo[j]=Math.max(memo[j], v.get(i)+memo[j-w.get(i)]);	
			}
		}
		return memo[C];
	}
	public static void main(String[] args) {
		List<Integer> w=new ArrayList<Integer>();
		List<Integer> v=new ArrayList<Integer>();
		w.add(1);
		w.add(2);
		w.add(3);
		v.add(6);
		v.add(10);
		v.add(12);
		Knapsack01dp2 k=new Knapsack01dp2();
		int i = k.knapsack01dp(w, v,5);
		System.out.println(i);
	}
}
