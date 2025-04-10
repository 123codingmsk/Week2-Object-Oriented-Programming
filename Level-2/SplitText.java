import java.util.*;

class SplitText{
	
	public static String[] splittext_2(String text){
		int wordCount = 1;
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' '){
				wordCount++;
			}
		}
		
		String[] temp = new String[wordCount];
		int index = 0;
		String word = "";
		
		for(int i=0; i<text.length(); i++){
			if(text.charAt(i) == ' '){
				if(!word.isEmpty()){
					temp[index++] = word;
					word = "";
				}
			}else{
				word += text.charAt(i);
			}
		}
		if(!word.isEmpty()){
			temp[index] = word;
		}
		return temp;
	}
	
	public static String[] splittext(String text){
		String[] temp = text.split(" ");
		return temp;
	}
	
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		
		String text = scn.nextLine();
		
		String[] res = splittext(text);
		String[] res_1 = splittext_2(text);
		
		System.out.println("Using built-in split(): " + Arrays.toString(res));
        System.out.println("Using custom method: " + Arrays.toString(res_1));
		
		if(	Arrays.equals(res_1, res)){
			System.out.println("Both are equal");
		}else{
			System.out.println("Both are not equal");
		}
		
	}
}