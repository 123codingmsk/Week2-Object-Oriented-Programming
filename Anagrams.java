import java.util.*;

class Anagrams{

	public static boolean removecharocc(String word1, String word2){
		int n = word1.length();
		int m = word2.length();
		
		if(n != m){
			return false;
		}
		
		for(int i=0; i<n; i++){
			char ch = word1.charAt(i);
			if(!word2.contains(String.valueOf(ch))){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args){
		
		String word1 = "hello";
		String word2 = "ollh";
		
		boolean res = removecharocc(word1, word2);
		System.out.print(res);
		
	}
}



