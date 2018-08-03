package xyz.marsj.dp;

import java.util.ArrayList;
import java.util.List;
/**
 * 01背包动态规划求解
 * @author sj
 *
 */
public class Knapsack01dp {
	public int knapsack01dp(List<Integer> w,List<Integer> v,int C){
		int n=w.size();
		int memo[][]=new int[n][C+1];
		if(n==0){
			return 0;
		}
	
		for(int j=0;j<=C;j++){
			if(j>=w.get(0)){
				memo[0][j]=v.get(0);				
			}else{
				memo[0][j]=0;
			}
		}
		for(int i=1;i<n;i++){
			for(int j=1;j<=C;j++){
				if(j>=w.get(i)){
				memo[i][j]=Math.max(memo[i-1][j], v.get(i)+memo[i-1][j-w.get(i)]);
				}else{
					memo[i][j]=memo[i-1][j];
				}
			}
		}
		return memo[w.size()-1][C];
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
		Knapsack01dp k=new Knapsack01dp();
		int i = k.knapsack01dp(w, v,5);
		System.out.println(i);
	}
}
