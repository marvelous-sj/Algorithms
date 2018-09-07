package xyz.marsj.test;
/**
 * 在n个数中选择k个使之和最大
 * @author sj
 *
 */
public class NeteaseTest1 {
	public static int choose(int n[],int k){
		int l=0,r=k;
		int temp=0;
		for(int i=0;i<k;i++){
			temp+=n[i];
		}
		int res=temp;
		while(r<n.length){
			temp+=n[r];
			r++;
			temp-=n[l];
			l++;
			res=Math.max(temp, res);
		}
		return res;
	}
	public static void main(String[] args) {
		int n[]={6,2,3,3,3,3,4};
		int choose = choose(n, 4);
		System.out.println(choose);
	}
}
