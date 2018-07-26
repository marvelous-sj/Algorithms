package xyz.marsj.search;

public class BinarySearch {
	int binarySearch (int arry[],int target){
		int r=arry.length;
		int l=0;//[l,r)
		while(l<r){
			int mid=l+(r-l)/2;
			if(arry[mid]<target){
				l=mid+1;
			}else if(arry[mid]>target){
				r=mid;
			}else{
				return mid;
			}
		}
		return -1;
	}
public static void main(String[] args) {
	int[] a={1,2,4,5,6,7,8,9,11,25,65,784,2231,13544,464531};
	int n=2231;
	BinarySearch binarySearch=new BinarySearch();
	int i = binarySearch.binarySearch(a, n);
	System.out.println(i);
}
}
