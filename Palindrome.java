import java.util.*;

class Palindrome{

	public static boolean palinorNot(String word){
		int l = 0;
		int e = word.length()-1;
		while(l < e){
			
			if(word.charAt(l) != word.charAt(e)){
				return false;
			}
			l++;
			e--;
		}
		return true;
	}
	
	public static void main(String[] args){
		String word = "aba";
		
		boolean res = palinorNot(word);
		
		if(res){
			System.out.println("It is a palindrome");
		}else{
			System.out.println("It is not a palindrome");
		}
	}
}


