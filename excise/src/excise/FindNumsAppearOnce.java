package excise;

public class FindNumsAppearOnce {
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
    	if(array.length==2){
    		num1[0]=array[0];
    		num2[0]=array[1];
    	}
    	int bitResult=0;
    	for(int i=0;i<array.length;i++){
    		bitResult^=array[i];
    	}
    	int index=findIndex(bitResult);
    	for(int i=0;i<array.length;i++){
    		if(isBit(array[i],index)){
    			num1[0]^=array[i];
    		}
    		else{
    			num2[0]^=array[i];
    		}
    	}
    	System.out.println(num1[0]+" "+num2[0]);
    }
    public static int findIndex(int bitResult){
    	int index=0;
    	while((bitResult & 1)==0 && index<32){
    		bitResult >>=1;
    		index++;
    	}
    	return index;
    }
    public static boolean isBit(int target,int index){
    	return ((target >> index) & 1)==0;
    }
    public static void main(String[] args) {
		int[] array={1,3,5,7,9,5,7,9};
		int num1[]=new int[1];
		int num2[]=new int[1];
		FindNumsAppearOnce(array,num1,num2);
		
	}
}
