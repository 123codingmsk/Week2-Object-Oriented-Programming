import java.util.*;

class RemoveSpeciChar{

	public static String removecharocc(String word, char ch){
		String temp = "";
		int n = word.length();
		
		for(int i=0; i<n; i++){
			char letter = word.charAt(i);
			if(letter == ch){
				continue;
			}
			temp = temp + letter;
		}
		return temp;
	}
	
	public static void main(String[] args){
		
		String word = "Hello World";
		char ch = 'l';
		
		String res = removecharocc(word, ch);
		System.out.print(res);
		
	}
}



