package excise;

public class QuickSort {
	public void sort(int[] a,int low,int high){
		if(low>=high){
			return ;
		}
		int i=low;
		int j=high;
		int index=a[low];
		while(i<j && a[j]>index){
			j--;
		}
		if(i<j){
			a[i++]=a[j];
		}
		while(i<j && a[i]<index){
			i++;
		}
		if(i<j){
			a[j--]=a[i];
		}
		a[i]=index;
		sort(a,low,i);
		sort(a,i+1,high);
	}
}
