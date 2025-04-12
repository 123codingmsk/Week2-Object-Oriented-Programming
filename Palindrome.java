import java.util.*;

class Palindrome{

	public static boolean palincheck(String word){
		int l = 0;
		int e = word.length()-1;
			
		while(l < e){
			if(word[l] != word[e]){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		boolean res = palincheck(word);
		if(res){
			System.out.println("Palindrome");
		}else{
			System.out.println("Not a Palindrome");
		}
		
		scn.close();
	}
}