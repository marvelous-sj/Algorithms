package xyz.marsj.sort;

public class QuickSort {

	public void quickSort(int arry[],int start){
		preSort(arry,start,arry.length-1);
	}

	private void preSort(int []arry, int l, int r) {
		if(l>=r){
			return;
		}
		int p=doSort(arry,l,r);
		preSort(arry,l,p-1);
		preSort(arry,p+1,r);
	}

	private int doSort(int []arry, int l, int r) {
		int v=arry[l];
		int temp;
		int i=l+1;
		int j=r;
		while(true){
			while(i<=r&&arry[i]<v){
				i++;
			}
			while(j>=l+1&&arry[j]>v){
				j--;
			}
			if(i>j) break;
			temp=arry[i];
			arry[i]=arry[j];
			arry[j]=temp;
			i++;j--;
		}
		temp=arry[l];
		arry[l]=arry[j];
		arry[j]=temp;
		return j;
	}
	public static void main(String[] args) {
		QuickSort sort=new QuickSort();
		int arry[]={1,6,4,2,6,4,63,2,5,8,2,3,4};
		sort.quickSort(arry, 0);
		for (int i = 0; i < arry.length; i++) {
			System.out.println(arry[i]);
		}
	}
}
