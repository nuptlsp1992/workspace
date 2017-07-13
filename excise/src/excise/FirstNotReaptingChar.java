package excise;
import java.util.LinkedHashMap;
public class FirstNotReaptingChar {
	    public static int FirstNotRepeatingChar(String str) {
	        LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
	        for(int i=0;i<str.length();i++){
	            if(map.containsKey(str.charAt(i))){
	                int time=map.get(str.charAt(i));
	                map.put(str.charAt(i),++time);
	                
	            }
	            else{
	                map.put(str.charAt(i),1);
	            }
	        }
	        for(int i=0;i<str.length();i++){
	            char a=str.charAt(i);
	            if(map.get(a)==1){
	                return i;
	            }
	        }
	        return -1;
	    }
	    public static void main(String[] args) {
			String str="aaabbbssccd";
			System.out.println(FirstNotRepeatingChar(str));
		}
}
