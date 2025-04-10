import java.util.*;

class VowelsCons{
	
	public static int[] findvowelcons(String word){
		int vowel = 0;
		int consonant = 0;
		
		for(int i=0; i<word.length(); i++){
			char ch = upTolow(word.charAt(i));
			if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				vowel++;
			}else{
				consonant++;
			}
		}
		return new int[]{vowel, consonant};
	}
	
	public static char upTolow(char letter){
		if(letter >= 'a' && letter <= 'z'){
			letter = (char)(letter - 32);
		}
		return letter;
	}
		
	
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		
		String word = scn.next();
		
		int[] res = findvowelcons(word);
		
		System.out.println("Vowels count: "+res[0]);
		System.out.println("Consonants count: "+res[1]);
		
		scn.close();
		
	}
}