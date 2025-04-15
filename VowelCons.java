import java.util.*;

class VowelCons{

	public static int[] countVowCon(String word){
		int vowels_count = 0;
		int conson_count = 0;
		for(int i=0; i<word.length(); i++){
			char ch= word.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				vowels_count++;
			}else{
				conson_count++;
			}
		}
		return new int[]{vowels_count, conson_count};
	}
	
	public static void main(String[] args){
		String word = "Manoj";
		
		int[] res = countVowCon(word);
		System.out.println("Vowels count: "+res[0]+"\nConsonants count: "+res[1]);
	}
}