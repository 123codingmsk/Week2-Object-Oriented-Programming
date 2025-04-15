import java.util.*;

class MostfreqCharac{

	public static char findfreqChar(String str){
		int n = str.length();
		int[] freq = new int[256];
		
		for(int i=0; i<n; i++){
			freq[str.charAt(i)]++;
		}
		
		char mostfreqchar = '\0';
		int maxcount = 0;
		
		for(int i=0; i<n; i++){
			if(freq[str.charAt(i)] > maxcount){
				maxcount = freq[str.charAt(i)];
				mostfreqchar = str.charAt(i);
			}
		}
		return mostfreqchar;
	}
	
	public static void main(String[] args){
		
		String str = "success";
		
		char res = findfreqChar(str);
		System.out.print("the most frequent character is: "+res);
		
	}
}



