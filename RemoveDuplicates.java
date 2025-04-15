import java.util.*;

class RemoveDuplicates{

	public static String removeduplicatechars(String word){
		String temp = "";
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			if(!temp.contains(String.valueOf(ch))){
				temp = temp + ch;
			}
		}
		return temp;
	}
	
	public static void main(String[] args){
		String word = "aabbbcc";
		
		String dup = removeduplicatechars(word);
		System.out.println(dup);
	}
}


