package xyz.marsj.test;

public class BeautifulNumLarge {
	//固定位数求进制，10^18最多64位
	public long beautifulNum(long n){
		for(int i=64;i>=2;i--){
			long radix= getRadix(n,i);
			if(radix!=-1){
				return radix;
			}
		}
		return n-1;
	}
	
	private long getRadix(long n, int i) {
		long l=2;
		long r=n-1;
		while(l<=r){
			long m =l+(r-l)/2;
			long t=compute(m,i);
			if(t<n){
				l=m+1;
			}else if(t>n){
				r=m-1;
			}else{
				return m;
			}
		}
		return -1;
	}



	private long compute(long radix, int bit) {
		long sum=0;
		long temp=1;
		for(int i=0;i<bit;i++){
			if(Long.MAX_VALUE-sum<temp){
				return Long.MAX_VALUE;
			}
			sum+=temp;
			if(Long.MAX_VALUE/temp<radix){
				temp=Long.MAX_VALUE;
			}else{
				temp*=radix;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		BeautifulNumLarge num=new BeautifulNumLarge();
		long beautifulNum = num.beautifulNum(1000000000000000000L);
		System.out.println(beautifulNum);
	}
}
