package excise;

public class InversePairs {
	static int count;
    public static int InversePairs(int [] array) {
    	count=0;
    	if(array!=null){
    		sort(array,0,array.length-1);
    	}
    	return count;
    }
    public static void sort(int[] array,int start,int end){
		int mid=(start+end) >> 1;
		if(start<end){
			sort(array,start,mid);
			sort(array,mid+1,end);
			merge(array,start,mid,end);
		}
	}
	public static void merge(int[] array,int start,int mid,int end){
    	int[] temp=new int[end-start+1];
    	int i=start;
    	int j=mid+1;
    	int k=0;
    	while(i<=mid && j<=end){
    		if(array[i]<array[j]){
    			temp[k++]=array[i++];
    		}
    		else{
    			temp[k++]=array[j++];
    			count+=mid-i+1;
    		}
    	}
    	while(i<=mid){
    		temp[k++]=array[i++];
 
    	}
    	while(j<=end){
    		temp[k++]=array[j++];
    	}
    	for(k=0;k<temp.length;k++){
    		array[start+k]=temp[k];
    	}
    }
	public static void main(String[] args) {
		int[] array={1,2,3,4,5,6,7,0};
		System.out.println(InversePairs(array));
	}
 
}
