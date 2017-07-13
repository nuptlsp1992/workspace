package excise;

public class FindGreatestSumOfSubArray {
	public static int FindGreatestSumOfSubArray(int[] array) {
		int sum,max,start,end,left;
		sum=max=start=left=end=array[0];
		for(int i=1;i<array.length;i++){
			if(sum<=0){
				sum=array[i];
				left=array[i];
			}
			else{
				sum=sum+array[i];
			}
			if(sum>max){
				max=sum;
				start=left;
				end=array[i];
			}
		}
		System.out.println(start + " " + end);
		return max;
	}
	public static void main(String[] args) {
		int[] array={6,-3,-2,7,-15,1,2,2};
		System.out.println(FindGreatestSumOfSubArray(array));
	}
}
