import java.util.*;

class ReplaceWord{

	public static String replace(String text, String word){
		String newStr = text.replace("m", word);
		return newStr;
	}
	
	public static void main(String[] args){
		
		String text = "I m Manoj";
		String word = "am";
		
		String res = replace(text, word);
		System.out.println(res);
	}
}



