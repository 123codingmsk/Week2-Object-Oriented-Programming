import java.util.*;

class SubstringOccur{

	public static int countSubstr(String word, String text){
		int count = 0;
		int index = 0;
		while((index = text.indexOf(word, index)) != -1){
			count++;
			index = index + word.length();
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String word = "man";
		String text = scn.nextLine();
		
		int res = countSubstr(word, text);
		System.out.print("The "+word+" comes "+res+" times in the "+text);
	}
}



