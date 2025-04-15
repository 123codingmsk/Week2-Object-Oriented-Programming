import java.util.*;

class Reverse{

	public static String reverse(String word){
		String temp = "";
		for(int i=word.length()-1; i>=0; i--){
			char ch = word.charAt(i);
			temp = temp + ch;
		}
		return temp;
	}
	
	public static void main(String[] args){
		String word = "Manoj";
		
		String rev_String = reverse(word);
		
		System.out.println(rev_String);
	}
}