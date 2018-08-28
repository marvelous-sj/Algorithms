package xyz.marsj.test;

public class BeautifulNum {
	public int beautifulNum(int n){
		for(int i=2;i<n;i++){
			if(isBeautiful(n,i)){
				return i;
			}
		}
		return n-1;
	}

	private boolean isBeautiful(int n, int i) {
		int res;
		while(n>i){
			res=n%i;
			n=n/i;
			if(res!=1){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		BeautifulNum num=new BeautifulNum();
		int beautifulNum = num.beautifulNum(29);
		System.out.println(beautifulNum);
	}
}
