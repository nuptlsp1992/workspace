package excise;

public class NumberOf1Between1AndN_Solution {
    public static void main(String[] args) {
		System.out.println(NumberOf1Between1AndN_Solution(100,300));
	}
    public static int NumberOf1Between1AndN_Solution(int m,int n) {
    	int count=0;
        StringBuffer sb=new StringBuffer();
        for(int i=m;i<=n;i++){
        	sb.append(i);
        }
        String str=sb.toString();
        for(int i=0;i<str.length();i++){
        	if(str.charAt(i)=='1'){
        		count++;
        	}
        }
        return count;
    }
}
