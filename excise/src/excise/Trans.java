package excise;

public class Trans {
	public static int fromStrToInt(String str){
		int neg = 0;
		int i=0;
		if(str.charAt(i)=='-'){
			neg=1;
		}
		if(str.charAt(i)=='+'){
			neg=0;
		}
		i++;
		int num=0;
		while(i<str.length()){
			int temp=str.charAt(i)-'0';
			num=num*10+temp;
			i++;
		}
		if(neg==1){
			return (0-num);
		}else{
			return num;
		}
	}
	public static void main(String[] args){
		String str="-5678";
		int num=fromStrToInt(str);
		System.out.println(num);
	}
}
