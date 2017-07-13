package excise;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {
	public static String PrintMinNumber(int [] numbers) {
		if(numbers==null || numbers.length==0) return "";
		int len=numbers.length;
		String[] str=new String[len];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<len;i++){
			str[i]=String.valueOf(numbers[i]);
		}
		Arrays.sort(str,new Comparator<String>() {
			public int compare(String s1,String s2){
				String c1=s1+s2;
				String c2=s2+s1;
				return c1.compareTo(c2);
			}
		});
		for(int i=0;i<len;i++){
			sb.append(str[i]);
		}
		return sb.toString();
    }
	public static void main(String[] args) {
		int[] numbers={3,32,321};
		System.out.println(PrintMinNumber(numbers));
	}
}
