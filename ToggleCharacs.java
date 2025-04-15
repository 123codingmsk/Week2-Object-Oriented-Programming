import java.util.*;

class ToggleCharacs{

	public static char lower(char letter){
		return Character.toLowerCase(letter);
	}
	
	public static char upper(char letter){
		return Character.toUpperCase(letter);
	}
	
	public static void main(String[] args){
		String word = "mANOj";
		String temp = "";
		for(int i=0; i<word.length(); i++){
			char ch = word.charAt(i);
			if(Character.isLowerCase(ch)){
				temp = temp + upper(ch);
			}else if(Character.isUpperCase(ch)){
				temp = temp + lower(ch);
			}else{
				temp = temp + ch;
			}
		}
		System.out.println(temp);
	}
}



