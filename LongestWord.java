import java.util.*;

class LongestWord{

	public static String findLongestword(String text){
		String[] textintowords = text.split(" ");
		
		int maxlen = 0;
		int start = 0;
		for(int i=0; i<textintowords.length; i++){
			int currlen = textintowords[i].length();
			if(maxlen < currlen){
				maxlen = currlen;
				start = i;
			}
		}
		return textintowords[start];
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		String text = scn.nextLine();
		
		String word = findLongestword(text);
		System.out.println("Longest word: "+word);
	}
}
//i am manoj


