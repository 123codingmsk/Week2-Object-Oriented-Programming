import java.util.*;

public class LowercaseCompare{

	public static String convert(String text){
		String temp = "";
		for(int i=0; i<text.length(); i++){
			char ch = text.charAt(i);
			if(ch >= 'A' &&  ch <= 'Z'){
				ch = (char)(ch + 32);
			}
			temp = temp + ch;
		}
		return temp;
	}
	
	public static boolean compareconvert(String text, String res){
		for(int i=0; i<res.length(); i++){
			if(text.charAt(i) != res.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String text = scn.next();
		
		String res = convert(text);
		boolean res1 = compareconvert(text, res);
		System.out.println(res);
		System.out.println(res1);
	}
}