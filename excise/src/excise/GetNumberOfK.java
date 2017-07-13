package excise;

public class GetNumberOfK {
	public static int GetNumberOfK(int [] array , int k) {
		int count=0;
		for(int i=0;i<array.length;i++){
			if(k==array[i]){
				count++;
			}
		}
		return count;
    }
	public static void main(String[] args) {
		int[] array={1,2,3,4,4,5,6,7,7,8,7};
		System.out.println(GetNumberOfK(array,7));
	}
}
